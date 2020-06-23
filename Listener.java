//imports
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

class Listener extends WindowAdapter implements ItemListener {
    
    JFrame frame;
    Choice choice;
    TextArea textArea;
    List list;
    
    //Constructor
    public Listener() {
        
        //Create the frame and customize the look and feel
        frame = new JFrame("Assignment6");
        frame.setSize(700, 400);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.addWindowListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //Instantiations and implementations
        choice = new Choice();
        textArea = new TextArea(5, 40);
        list = new List(8, true);
        choice.addItemListener(this);
        list.addItemListener(this);
        
        //Creating the list
        ArrayList<String> countries = new ArrayList<>();
        countries.add(" ");
        countries.add("China ");
        countries.add("Japan ");
        countries.add("Korea ");
        countries.add("India ");
        countries.add("Malaysia ");
        countries.add("Vietnam ");
        
        //Filling the combobox with the list contents
        for(int i = 0; i < countries.size(); i++){
            list.add(countries.get(i));
        }
        //Filling the list with the list contents, secondary option for selection
        for(int i = 0; i < countries.size(); i++){
            choice.add(countries.get(i));
        }
        
        //Adding components to the GUI
        frame.add(choice);
        frame.add(textArea);
        frame.add(list);
        
    }//constructor
    
   //Method for adding actions and events on mouse click
    @Override
    public void itemStateChanged(ItemEvent e) {
        String selectedCountry = choice.getSelectedItem();
        textArea.setText(selectedCountry);
        String[] newCountry = list.getSelectedItems();
        for(String t: newCountry){
            textArea.append(t + " ");
        }
    }
    
    public static void main(String[] args) {
        
        //Implement the constructor
        new Listener();
        
    }//main
}//class
