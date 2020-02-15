package day59;

public class General {

    public static void main(String[] args) {


//        Object o = new String("abc");
        // can I get the first char using o
//        System.out.println( o.charAt(0)  );
        System.out.println(" THE START ");
//        String str = null ;

        String str = "";
        // IF YOU HAVE MUTI TRY CATCH BLOCK
        // The most specific type (child type ) should come first
        // the more generic type (super type ) should come last

        try {

            System.out.println(str.charAt(0));
            System.out.println("END OF TRY");

        } catch (NullPointerException bla) {

            System.out.println("NO OBJECT HERE!!!!!");

        } catch (Exception e) {

            System.out.println(e.getMessage());
            System.out.println("THIS IS THE REST OF EXCEPTIONS ");

        }


    }


}
