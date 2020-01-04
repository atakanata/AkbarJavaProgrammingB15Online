package day36;

public class WrapperReview {

    public static void main(String[] args) {

        /*
        *
Boolean , Character ,
Byte , Short , Integer ,Long ,  Float , Double

These classes coming from java.lang package
collectively called -->> Primitive Wrapper Classes

It has a lot static methods built in theses classes
to work with this type of data

1 , parse String into primitive types value
	converting String to int
	"123" ---> 123  Integer.parseInt("123");

	// THIS WILL NOT WORK!!!
	// parseMethod accept Strint will turn it into int
	// passing character here!!! BAD IDEA!!!
	Integer.parseInt('9')
	char myChar = '9' ;

	Integer.parseInt(myChar+"") -->> int 9

	// are character 9 and int 9 same thing????
	'9' == 9 -->>>  //FALSE  57==9

	// "123" -->> 123L
	Long.parseLong("123")  --->> 123L

	// IMPORTANT :
	// ALL parseX method return primitive value

2, Wrap up primitive value to create Object

		// Object oName = new Object();
		String str = new String("Happy New Year");
		int[] nums = new int[8];
		// deprecated means : old way
		Integer i1 = new Integer(1230000);
		* recommended way (it is a method that return Integer)
		* return
		Integer i2 = Integer.valueOf(123);
        *
        * */

        Integer i1 = new Integer(1000000000);
        Integer i2 = Integer.valueOf(123);

        // is i3 primitive type variable
        // is i3 reference type variable
        // Auto boxing : primitive to wrapper type conversion
        Integer i3 = 45; //. -->> 45 -->> new Integer(45) ;

        int i4 = 54;
        // Auto unboxing : wrapper type to primitive type conversion
        int i5 = new Integer(100); // new Integer(100) -->> 100

        // AUTO BOXING AND UNBOXING IS UNIQUE FEATURE
        // OF CONVERSION BETWEEN PRIMITIVE VALUE WRAPPER CLASSES OBJECTS
        System.out.println(i1 + i2);

    }

}
