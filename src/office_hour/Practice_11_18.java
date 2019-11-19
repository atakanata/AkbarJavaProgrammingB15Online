package office_hour;

public class Practice_11_18 {

    public static void main(String[] args) {

        //System.out.println("aaa");
        // compound operator| shorthand operator
        // += , -= , *= , /= , %=

        // increment and decrement operator
        // ++ --

        // Relational Operator or Comparision Operator
        // > >=  < <=  checking more or less
        // == !=       checking for equality and inequality

        // casting : converting one type to another
        // upcasting | type widening
        // converting data with smaller range data type to bigger range data type
        // for example converting int to long , int to double
        //  this happen implicitly (automatically )
        //  double price = 99 ;  if this printed out 99.0

        double price = 99;             // 99--> 99.0
        long earthToKrypton = 15000;   // 15000 -->> 15000L


        // downcasting | type narrowing
        // converting data with bigger range data type to smaller range data type
        // for example converting double to int , or long to short
        // this must happen explicitly (by user) OR IT WILL NOT COMPILE
        // Just like we can not put large coffee into small cup , IT WILL SPILL!!!
        // In order to make it to work , we need cast it explicitly
        // to tell compiler this is what we want to do even though potential data loss occure
        // for example
        //  int priceAsWholeNumber =  99.45 ; ERROR!!!
        //  int priceAsWholeNumber = (int) 99.45 ;   // 99 , 0.45 IS LOST!!
        int myMediumCup = (int) 100L;


        // Special case of char to int
        //  each character is represented by numbers in ascii table (google this table)

        char myLetter = 'A';
        System.out.println(myLetter);

        // int only store number ,
        // so here it turns the character into Ascii code number representation of the letter
        int myLetter2 = 'A';
        System.out.println(myLetter2);

        int myLetter3 = 'a';
        System.out.println(myLetter3);

        char myLetter4 = 87;
        System.out.println(myLetter4);

        char myLetter5 = '8';
        System.out.println(myLetter5);

        // -----------------------------

        // --- positive and negative number in programming

        //  +
        //    Arithmetic addition operator  5 + 10 = 15 ;
        //   Shorthand Operator  int x = 10 ;    x += 3 ; //13
        //    increment operator  ++x , x++
        //    concatenation    "Jon " + "Snow" = "Jon Snow"
        //    It can also indicate a number is positive  int i =  +5 ; It's optional

        // -
        //   Arithmetic substraction operator  15 - 10 = 5 ;
        //   Shorthand Operator  int x = 10 ;    x -= 3 ; //7
        //   decrement operator  --x , x --  decrease the number by 1
        //   It can be also used to indicate a number is negative number :
        //   for example  int bankBalance =   -190  ; NOT OPTIONAL


        int num = 10;

        System.out.println(num == 10);
        System.out.println(num != 10);

        // -- we can store the result of relational operation into boolean variable
        // because all of them will return true or false
        boolean isNumEqual10 = (num == 10);


    }

}
