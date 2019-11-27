package day14;

public class StringMethodCharAt {

    public static void main(String[] args) {

        // charAt method of String
        // it will return a character at certain location specified
        String aName = "Arya";
        char c1 = aName.charAt(0);
        char c2 = aName.charAt(1);
        char c3 = aName.charAt(2);
        char c4 = aName.charAt(3);

        // A r y a
        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);


        String name = "Rukhshona";

        System.out.print(name.charAt(0) + " ");
        System.out.print(name.charAt(1) + " ");
        System.out.print(name.charAt(2) + " ");
        System.out.print(name.charAt(3) + " ");
        System.out.print(name.charAt(4) + " ");
        System.out.print(name.charAt(5) + " ");
        System.out.print(name.charAt(6) + " ");
        System.out.print(name.charAt(7) + " ");
        System.out.print(name.charAt(8) + " ");

        System.out.println("--------");

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(6));
        System.out.println(name.charAt(7));
        System.out.println(name.charAt(8));


    }

}
