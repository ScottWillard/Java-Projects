import java.util.Scanner;

public class RleProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean trigger = true;
        byte[] encodedData = new byte[999];
        byte[] decodedData = new byte[999];

        // Code for testing methods
        byte[] testArr = new byte[]{15, 15, 6, 4};
        String testString = "2e:15f:15f:5f:12:1a:12:6f:26:3f:12:2a:12:4f:46:3f:12:2a:22:2f:46:4f:12:2a:12:3f:26:2f:42:1a:12:1a:12:4f:22:1a:12:5a:12:3f:12:4a:12:4a:12:1f:22:10a:22:11a:12:1f:12:1a:32:2a:32:2a:12:1f:12:2a:12:1f:12:1a:12:2f:12:1a:12:2f:22:2f:12:2a:12:1f:12:2a:12";
        testArr = stringToRle(testString);
        decodedData = decodeRle(testArr);


        //Welcome message
        System.out.println("Welcome to the RLE image encoder!");
        System.out.println("\nDisplaying Spectrum Image:");

        ConsoleGfx.displayImage(ConsoleGfx.testRainbow);
        boolean checkData = false;

        String flatHexValues = "";
        String display = "";

        // Menu loop
        while (trigger) {
            System.out.println("RLE Menu\n--------");
            System.out.println("0. Exit\n1. Load File\n2. Load Test Image\n3. Read RLE String");
            System.out.println("4. Read RLE Hex String\n5. Read Data Hex String\n6. Display Image");
            System.out.println("7. Display RLE String\n8. Display Hex RLE Data\n9. Display Hex Flat Data");

            //Prompt user for input
            System.out.print("Select a Menu Option: ");

            //Take in user input
            int option = input.nextInt();
            System.out.print("\n");

            switch (option) {
                //Menu options
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Enter name of file to load: ");
                    String filename = input.next();
                    decodedData = ConsoleGfx.loadFile(filename);
                    checkData = true;
                    break;
                case 2:
                    System.out.println("Test image data loaded.");
                    decodedData = (ConsoleGfx.testImage);
                    checkData = true;
                    break;
                case 3:
                    System.out.println("Enter an RLE string to be decoded: ");
                    String toBeDecoded = input.next();
                        encodedData = stringToRle(toBeDecoded);
                        decodedData = decodeRle(encodedData);
                        checkData = true;
                    break;
                case 4:
                    System.out.print("Enter the hex string holding RLE data: ");
                    String hexStringHolding = input.next();
                    decodedData = stringToData(hexStringHolding);
                    checkData = true;
                    break;
                case 5:
                    System.out.println("Enter the hex string holding flat data: ");
                    String enteredString = input.next();
                    decodedData = stringToData(enteredString);
                    checkData = true;
                    break;
                case 6:
                    if (!checkData) {
                        System.out.println("No data to display...");
                        break;
                    } else {
                        System.out.println("Displaying image...");
                        ConsoleGfx.displayImage(decodedData);
                        break;
                    }
                case 7:
                    if (!checkData) {
                        System.out.println("No data to display...");
                        break;
                    }
                    encodedData = encodeRle(decodedData);
                    display = toRleString(encodedData);
                    System.out.println("RLE representation: " + display);
                    break;
                case 8:
                    if (!checkData) {
                        System.out.println("No data to display...");
                        break;
                    }
                    encodedData = encodeRle(decodedData);
                    display = toHexString(encodedData);
                    System.out.println("RLE hex values: " + display);
                    break;
                case 9:
                    if (!checkData) {
                        System.out.println("No data to display...");
                        break;
                    }
                    flatHexValues = toHexString(decodedData);

                    System.out.println("Flat hex values: " + flatHexValues);
                    break;
                default:
                    System.out.println("Error! Invalid input.");
                    break;
            }
        }
    }

    public static String toHexString(byte[] data) {

        StringBuilder output = new StringBuilder();
        for (byte datum : data) {
            //Loops through byte array, adds hex value to end of string
            output.append(String.format("%01x", datum));
        }
        return output.toString();
    }

    public static int countRuns(byte[] flatData) {
        int total = 1;


        //Get the quantity of runs
        for (int i = 0; i < (flatData.length - 1); i++) {
            if (flatData[i] != flatData[i + 1]) {
                total++;
            }
        }
        return total;
    }

    public static byte[] encodeRle(byte[] flatData) {
        byte increase = 1;
        int j = 0;
        int i = 0;

        //Flat -> Encoded
        byte[] encodedArr = new byte[countRuns(flatData) * 2];
        for (i = 0; i < flatData.length - 1; i++) {
            if (flatData[i] == flatData[i + 1]) {
                increase++;
            } else {
                encodedArr[j++] = increase;
                encodedArr[j++] = flatData[i];
                increase = 1;
            }
        }
        encodedArr[j++] = increase;
        return encodedArr;
    }

    public static int getDecodedLength(byte[] rleData) {
        int arrength = 0;
        for (int i = 0; i < rleData.length - 1; i = i + 2) {
            arrength += rleData[i];
        }
        return arrength;
    }

    public static byte[] decodeRle(byte[] rleData) {
        byte[] outputArr = new byte[getDecodedLength(rleData)];

        //Iterable variables
        int i = 0;
        int j = 0;
        int count = 0;

        for (i = 0; i < rleData.length - 1; i = (i + 2)) {
            for (j = 0; j < rleData[i]; j++) {
                outputArr[count] = rleData[i + 1];
                count++;
            }
        }

        return outputArr;
    }

    public static byte[] stringToData(String dataString) {
        byte[] outputArr = new byte[dataString.length()];

        for (int i = 0; i < outputArr.length; i++) {
            //Hex formatting
            outputArr[i] = (byte) Integer.parseInt(dataString.substring(i, i + 1), 16);
        }

        return outputArr;
    }

    public static String toRleString(byte[] rleData) {
        int i = 0;
        int a = 0;
        int o = 0;

        String rleString = "";

        byte[] occurrenceArr = new byte[rleData.length / 2];
        byte[] valueArr = new byte[rleData.length / 2];

        // Write to occurrenceArr
        for (i = 0; i < rleData.length; i = (i + 2)) {
            occurrenceArr[o++] = rleData[i];
        }

        // Write to valueArr
        for (i = 1; i < rleData.length; i = (i + 2)) {
            valueArr[a++] = rleData[i];
        }

        for (i = 0; i < (rleData.length); i = i + 2) {
            rleString += rleData[i];

            // Iterates through byte array, appends hex value to string
            rleString += String.format("%01x", (rleData[i + 1]));

            if (i < rleData.length - 2) {
                rleString += ":";
            }
        }
        return rleString;
    }

    public static byte[] stringToRle(String rleString) {
        //Iteration variables
        int j = 0;
        int i = 0;

        //Occurrences, Values respectively
        int o = 0;
        int v = 0;

        String occurrences = "";
        String value = "";
        //Loops through the iterations
        String iter = "";
        String[] splitArr = rleString.split(":", -1);
        byte[] outputArr = new byte[splitArr.length * 2];

        for (i = 0; i < splitArr.length; i++) {
            iter = splitArr[i];
            occurrences = iter.substring(0, (iter.length() - 1));

            value = iter.substring(iter.length() - 1);

            switch (value) {
                case "a":
                    value = "10";
                    break;
                case "b":
                    value = "11";
                    break;
                case "c":
                    value = "12";
                    break;
                case "d":
                    value = "13";
                    break;
                case "e":
                    value = "14";
                    break;
                case "f":
                    value = "15";
                    break;
            }
            v = Integer.parseInt(value);
            o = Integer.parseInt(occurrences);
            outputArr[j] = (byte) o;
            outputArr[j + 1] = (byte) v;
            j = j + 2;
        }
        return outputArr;
    }
}