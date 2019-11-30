package day16;

public class IndexOfWith2Parameters {

    public static void main(String[] args) {
        //             012345678901234567890123456789012
        //String name = "I love Java I Love Java Java Java";

        // get the second java from the sentnece
        // assume you already know there is 4 Java in this sentence
        // second java means -->> the Java showed up after first Java

        // first find out where is location of the first Java showed up
        // in order to find second one ,
        // instead of searching from beginning,
        // search from right after the location you found first Java
        // then it will give give you the index of second java

        // BUT HOW DO I START FROM DIFFERENT LOCATION WHEN USING INDEXOF
        // BECAUSE INDEX OF ALWAYS START FROM BEGINNING

        // indexOf method has 2 version 1 expect 1 external data
        // another expect 2 external data -->> yourString.indexOf()

        //             012345678901234567890123456789012
        String name = "I love Java I Love Java Java Java";

        System.out.println("Java starting from 0 " + name.indexOf("Java"));
        System.out.println("Java starting from 7 " + name.indexOf("Java", 7));
        System.out.println("Java starting from 8 " + name.indexOf("Java", 8));
        System.out.println("Java starting from 9 " + name.indexOf("Java", 9));
        System.out.println("Java starting from 19 " + name.indexOf("Java", 19));
        System.out.println("Java starting from 20 " + name.indexOf("Java", 20));

        // How do i start from the location that get past first Java
        // basically starting point different that 0 so that It get past first Java
        int fistJavaLocation = name.indexOf("Java"); // location of first java in this case 7
        // starting point can be right after the index of first character of the word
        // or you can start here  + 4
        // or you can start write after you finish the word you are searching , for the word java  + 4
        // if we do not know the length of the word -->> + word.length()
        int startingPointToSearchSecondJava = fistJavaLocation + 1;
        int secondJavaLocation = name.indexOf("Java", startingPointToSearchSecondJava);

        System.out.println("second Java Location = " + secondJavaLocation);

        // I do not know how many word in this sentence . I only know there 3+ words
        // and there is only one space in between words
        // I just want to know what is the second word
        // the word in between first space and second space is second word
        int firstSpaceLocation = name.indexOf(" ");
        int secondSpaceLocation = name.indexOf(" ", firstSpaceLocation + 1);

        System.out.println("Second word in this sentence is "
                + name.substring(firstSpaceLocation + 1, secondSpaceLocation));


    }

}
