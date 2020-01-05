package day37;

import java.util.ArrayList;

public class ArrayList_LoopPractice {

    public static void main(String[] args) {

        ArrayList<String> nameLst = new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        nameLst.add("Ayjerenjan");

        System.out.println("nameLst = " + nameLst);

        // find longest name
        // assume the first one is the longest then compare with the rest
        String longestName = ""; //nameLst.get(0)

        for (int x = 0; x < nameLst.size(); x++) {

            String currentName = nameLst.get(x);
            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if (currentName.length() >= longestName.length()) {
                longestName = currentName;
            }

        }
        //System.out.println("longestName = " + longestName);

        // How do I get the concatenation of all longest words if there are more than one
        // first find out the longest word , and get the character count
        // then loop through each names
        // and check whether character count equal to longest word character count
        for (int i = 0; i < nameLst.size(); i++) {

            if (nameLst.get(i).length() == longestName.length()) {
                System.out.println("Longest words = " + nameLst.get(i));
            }

        }

        // length     :  counting the elements inside array , it's a property of array object
        // last element of an array :  arr[arr.length-1]
        // length()   :  counting the characters inside String , it's a method of String object
        // last char of a String :  str.charAt( str.length() -1 )
        // size()     :  counting the elements inside ArrayList object, , it's a method of List Object
        // last element of an arrayList :  lst.get( lst.size()-1 )


    }


}
