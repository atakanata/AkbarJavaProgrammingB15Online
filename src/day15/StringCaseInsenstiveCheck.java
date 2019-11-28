package day15;

public class StringCaseInsenstiveCheck {

    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println("name contains st RESULT IS :   " + name.contains("st"));

        // I wanna check whether this name contains st no matter the case
        // so I want to store the uppercase version of this name then check for ST

        String uppercaseName = name.toUpperCase(); // "ARYA STARK";
        System.out.println("uppercaseName contains ST or not ? " + uppercaseName.contains("ST"));

        String lowercaseName = name.toLowerCase(); //"arya stark";
        System.out.println("lowercaseName contains st or not ? " + lowercaseName.contains("st"));

        // This is called method chaining , combining multiple method call
        // make my name all lowercase (String) then check whether it contains lowercase st
        // THIS WORK BECAUSE name.toLowerCase() result in another String object
        System.out.println(name.toLowerCase().contains("st")); // THIS WORK BECAUSE
        //System.out.println( name.length().toUppercase()  ); BAD IDEA!!!

    }


}
