package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {

    public static void main(String[] args) {

        List<String> nameLst = new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");

        printAList(nameLst);

        String resultlongest = getLongestElement(nameLst);
        System.out.println("resultlongest = " + resultlongest);

//        byte myByte = 17 ;
//        printByte( myByte );
//        int myInt = 100 ;
//        printByte(  myInt   );
    }


    public static String getLongestElement(List<String> nameLst) {

        String longestName = ""; //nameLst.get(0)

        for (int x = 0; x < nameLst.size(); x++) {
            String currentName = nameLst.get(x);
            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if (currentName.length() >= longestName.length()) {
                longestName = currentName;
            }
        }
        return longestName;
    }

    /**
     * This method will print out the content of passed List object vertically
     *
     * @param lst of String
     * @return nothing
     */
    public static void printAList(List<String> lst) {

        for (String each : lst) {
            System.out.println("each = " + each);
        }

    }

    /**
     * A simple method to print a byte value passed
     *
     * @param b
     */
    public static void printByte(byte b) {
        System.out.println("You passed byte value = " + b);
    }


}
