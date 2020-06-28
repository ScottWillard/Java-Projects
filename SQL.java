
/*
1, "________ is the physical aspect of the computer that can be seen", "Hardware", "Software", "Operating system", "Application program", "a"
2, "__________ is the brain of a computer", "Hardware", "CPU", "Memory", "Disk", "b"
3, "The speed of CPU is measured in __________", "megabytes", "gigabytes", "megahertz", "gigahertz", "cd"
4, "Why do computers use zeros and ones?", "because combinations of zeros and ones can represent any numbers and characters", "because digital devices have two stable states and it is natural to use one state for 0 and the other for 1", "because binary numbers are simplest", "because binary numbers are the bases upon which all other number systems are built", "b"
5, "One byte has ________ bits", "4", "8", "12", "16", "b"
6, "A 3.5-inch floppy can hold up to _________ bytes", "0.5 MB", "1.44 MB", "10 MB", "100 MB", "b"
7, "A regular CD-ROM can hold up to _________ bytes", "a. 100 MB", "700 MB", "1 GB", "10 GB", "b"
8, "____________ is a device to connect a computer to a local area network (LAN)", "regular modem", "DSL", "Cable modem", "NIC", "d"
9, "____________ are instructions to the computer", "Hardware", "Software", "Programs", "Keyboards", "bc"

*/

//Import required packages
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class SQL {
    //JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/Assignment10";
    
    //Database credentials
    static final String USER = "root";
    static final String PASS = "1234";
    
    public static void main(String[] args) {
        //Local variables
        String questionID;
        String question;
        String choicea;
        String choiceb;
        String choicec;
        String choiced;
        String answer;
        
        //SQL objects
        PreparedStatement ps;
        Connection con;
        
        //Find the text file and read the data from it, catch any errors
        try {
            File f = new File("C:\\Users\\Scott Willard\\Desktop\\Valencia Summer 2020" +
                    "\\Advanced Java Programming\\Assignment10TextFiles\\Quiz.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String username = USER;
            String pwd = PASS;
            String connurl = DB_URL;
            
            //Connect to MySQL database
            con = DriverManager.getConnection(connurl, username, pwd);
            Class.forName(JDBC_DRIVER);
            System.out.println("Connection to the database established");
            String line;
            
            //Create the table
            String sql = "CREATE TABLE Quiz" +
                    "(questionId int, " +
                    " question varchar(4000), " +
                    " choicea varchar(1000), " +
                    " choiceb varchar(1000), " +
                    " choicec varchar(1000)," +
                    "choiced varchar(1000)," +
                    "answer varchar(5))";
            ps = con.prepareStatement(sql);
            
            //Execute table creation query
            try {
                System.out.println("Table \"Quiz\" has been created...");
                ps.executeUpdate(sql);
            } catch (SQLSyntaxErrorException SSEE) {
                System.out.println("Table already exists...");
            }
            
            //While loop to recursively extract data from text file to MySQL
            while ((line = br.readLine()) != null) {
                String tmp[] = line.split(",");
                questionID = tmp[0];
                question = tmp[1];
                choicea = tmp[2];
                choiceb = tmp[3];
                choicec = tmp[4];
                choiced = tmp[5];
                answer = tmp[6];
                
                //Query for populating table with text file data
                String quiz =
                        "INSERT INTO Quiz (questionId, question," +
                                " choicea, choiceb , choicec , choiced , answer)" +
                                " values" + "("
                                + questionID + "," + question + "," + choicea + ","
                                + choiceb + "," + choicec + "," + choiced + "," + answer + ")";
                
                //Execute table filling query
                ps.executeUpdate(quiz);
            }
            //Close the streams
            br.close();
            con.close();
            ps.close();
        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }//main
}//SQL
