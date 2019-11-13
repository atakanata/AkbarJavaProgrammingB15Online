package office_hour; // package is just like a folder in your file system

// class is the most fundemental building block where you write code

public class Practice_11_13 {


    public static void main(String[] args) {
//        Class
//        It should always always start with uppercase
//        If you have more than one word :  camel case
//
//                Package
//        It should always start with lowercase
//        if you have more than one word use underscore
//
//        Variable
//        it should always start with lowercase
//        If you have more than one word :  camel case
//
//
//     ALL NAMES should be descriptive to make it obvious to see the purpose of creating them
        // if we go over the range of the type can hold , it does not compile
        // byte sheepCount = 129 ;

        double potatoPrice = 12.99d;
        // if a fractional number appear , compiler automatically assume it's a double
        // so d is optional but highly recommended
        double bananaPrice = 12.99;

        float ipadSize1 = 12.9f;

        double ipadSize2 = 12.9f;
        // double can hold any type of number because it has largest range
        double bankBalance = 3000;

        System.out.println(bankBalance);

        // be careful , bear shouldn't ingest large fluffy dog
        // boolean , char ,
        // byte , short , int , long , float , double

        char myFavoriteCharacter = 'A';
        char myFavoriteCharacter2 = 65;  // each character has it's own number representation in Ascii table


        // both of them will result letter A because data type is char for both of them
        System.out.println(myFavoriteCharacter);
        System.out.println(myFavoriteCharacter2);


        String todaysTopic = " Arithmetic Operator and Scanner , class duration is 3 hour";

        System.out.println("Topic and duration : \n " + todaysTopic);

        char myNine = '9';     /// storing 9 as character will work
        // char myNine = '99' ; /// storing 99 as character will not work because its more than 1


    }


}

