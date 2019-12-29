package day35;

/**
 * @author : akbar
 * Created At : 12/28/19
 */
public class WrapperClassMethods {

    public static void main(String[] args) {

        // 8 Primitive type boolean , char    , byte , short , int , long , float , double
        // have corresponding class type , known as wrapper classes
        // they are        Boolean , Character, Byte , Short, Integer, Long, Float , Double

        // The most important reason to Wrapper classes exists is :
        // to wrap up the primitive values and turn it into Object
        // so it can be treated as object and have behaviours
        // All the collections starting from ArrayList CAN ONLY STORE OBJECT NOT PRIMITIVES

        // These wrapper classes also have useful static methods we can use directly
        // One of the common useful use case of to Wrapper classes is
        // turning String into primitive value using the static parse Method
        byte   bValue = Byte.parseByte("123");
        short  sValue = Short.parseShort("1230");
        int    iValue = Integer.parseInt("12300");
        long   lValue = Long.parseLong("123000");
        float  fValue = Float.parseFloat("12.99");
        double dValue = Double.parseDouble("3.1487136452");
        boolean bVal  = Boolean.parseBoolean("true");
        System.out.println("byte   Value | Byte.parseByte(\"123\") = "      + bValue);
        System.out.println("short  Value | Short.parseShort(\"1230\") = "   + sValue);
        System.out.println("int    Value | Integer.parseInt(\"12300\") = "  + iValue);
        System.out.println("long   Value | Long.parseLong(\"123000\") = "   + lValue);
        System.out.println("float  Value | Float.parseFloat(\"12.99\") = "  + fValue);
        System.out.println("double Value | Double.parseDouble(\"3.1487136452\") = " + dValue);
        System.out.println("boolean Value| Boolean.parseBoolean(\"true\") = " + bVal);
        // and yes there ain't no Character.parseChar !

        System.out.println("\n-----------Integer-----------------");

        Integer integerObj = Integer.valueOf("120"); //or Integer.valueOf(120)
        //or old way (same of all primitives other than Character)
        // Integer integerObj = new Integer("120");
        System.out.println("integerObj = " + integerObj);
        System.out.println("Get Integer Object-> Integer.valueOf(10) = "     + Integer.valueOf(10));
        System.out.println("Get Integer Object-> Integer.valueOf(\"10\") = " + Integer.valueOf("10"));
        // all wrapper class object have toString method
        System.out.println("Convert number to String :Integer.toString(10) " + Integer.toString(10));

        System.out.println("Convert String to int-> Integer.parseInt(\"100\") = " + Integer.parseInt("100"));
        System.out.println("Integer.max(10,20) = " + Integer.max(10,20));
        System.out.println("Integer.min(10,20) = " + Integer.min(10,20));
        System.out.println("Integer.sum(10,20) = " + Integer.sum(10,20));
        // check which number is bigger or smalled and return 1 , 0 , -1 according to result
        // all Wrapper classes have this static method
        System.out.println("Integer.compare(10,20) = " + Integer.compare(10,20));
        System.out.println("Integer.compare(20,20) = " + Integer.compare(20,20));
        System.out.println("Integer.compare(20,10) = " + Integer.compare(20,10));


        System.out.println("\n-----------Covert Integer object to primitives-----------------");
        Integer i1 = Integer.valueOf("12");
        System.out.println("convert Integer Object to byte  : i1.byteValue()  -> " + i1.byteValue());
        System.out.println("convert Integer Object to short : i1.shortValue() -> " + i1.shortValue());
        System.out.println("convert Integer Object to long  : i1.longValue() -> " + i1.longValue());
        System.out.println("convert Integer Object to double : i1.floatValue() -> " + i1.floatValue());
        System.out.println("convert Integer Object to double : i1.shortValue() -> " + i1.doubleValue());

        System.out.println("\n-----------Covert Double object to primitives-----------------");
        Double d1 = Double.parseDouble("3.14");
        System.out.println("convert Double Object to byte  : d1.byteValue()  -> " + d1.byteValue());
        System.out.println("convert Double Object to short : d1.shortValue() -> " + d1.shortValue());
        System.out.println("convert Double Object to long  : d1.longValue() -> " + d1.longValue());
        System.out.println("convert Double Object to double : d1.floatValue() -> " + d1.floatValue());
        System.out.println("convert Double Object to double : d1.shortValue() -> " + d1.doubleValue());

        System.out.println("\n-----------CHARACTER-----------------");

        Character charObject = Character.valueOf('a');  // "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF"
        System.out.println("Get Character Object-> Character.valueOf('a') = " + Character.valueOf('a') );
        System.out.println("Character.isDigit('7') = "      + Character.isDigit('7'));
        System.out.println("Character.isLetter('A') = "     + Character.isLetter('A'));
        System.out.println("Character.isLetterOrDigit(' ') = " + Character.isLetterOrDigit(' '));
        System.out.println("Character.isUpperCase('a') = "  + Character.isUpperCase('a'));
        System.out.println("Character.isLowerCase('b') = "  + Character.isLowerCase('b'));
        System.out.println("Character.toUpperCase('a') = "  + Character.toUpperCase('a'));
        System.out.println("Character.toLowerCase('A') = "  + Character.toLowerCase('A'));

        System.out.println("\n-----------BOOLEAN-----------------");
        System.out.println("Get Boolean Object-> Boolean.valueOf(\"True\") = "  + Boolean.valueOf("True"));
        System.out.println("Get Boolean Object-> Boolean.valueOf(\"False\") = " + Boolean.valueOf("False"));
        System.out.println("Get Boolean Object-> Boolean.valueOf(\"ABC\") = "   + Boolean.valueOf("ABC"));

        System.out.println("Get boolean primitive-> Boolean.getBoolean(\"TRUE\") = "    + Boolean.getBoolean("TRUE"));
        System.out.println("Get boolean primitive-> Boolean.getBoolean(\"EFG\")  = "    + Boolean.getBoolean("EFG"));
        System.out.println("Get boolean primitive-> Boolean.parseBoolean(\"False\") = " + Boolean.parseBoolean("False"));
        System.out.println("Get boolean primitive-> Boolean.parseBoolean(\"XYZ\") = "   + Boolean.parseBoolean("XYZ"));
        // all Wrapper classes has toString method to turn Object into String
        System.out.println("Convert true to String :Boolean.toString(true) " + Boolean.toString(true));

        System.out.println("\n-----------Getting Range of Primitives-----------------");
        // finding min and max range of primitive types
        System.out.println("Largest number byte can hold : Byte.MAX_VALUE = " + Byte.MAX_VALUE  );
        System.out.println("Lowest  number byte can hold : Byte.MIN_VALUE = " + Byte.MIN_VALUE  );
        System.out.println("Largest number Short can hold : Short.MAX_VALUE = " + Short.MAX_VALUE  );
        System.out.println("Lowest  number Short can hold : Short.MIN_VALUE = " + Short.MIN_VALUE  );
        System.out.println("Largest number int can hold : Integer.MAX_VALUE = " + Integer.MAX_VALUE  );
        System.out.println("Lowest  number int can hold : Integer.MIN_VALUE = " + Integer.MIN_VALUE  );
        System.out.println("Largest number long can hold : Long.MAX_VALUE = " + Long.MAX_VALUE  );
        System.out.println("Lowest  number long can hold : Long.MIN_VALUE = " + Long.MIN_VALUE  );
        System.out.println("Largest number float can hold : Float.MAX_VALUE = " + Float.MAX_VALUE  );
        System.out.println("Lowest  number float can hold : Float.MIN_VALUE = " + Float.MIN_VALUE  );
        System.out.println("Largest number double can hold : Double.MAX_VALUE = " + Double.MAX_VALUE  );
        System.out.println("Lowest  number double can hold : Double.MIN_VALUE = " + Double.MIN_VALUE  );

    }

}
