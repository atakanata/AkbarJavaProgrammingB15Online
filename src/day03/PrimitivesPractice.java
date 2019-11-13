package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {


        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount);
        // use above example to print out the rest of the variable value in similar format.
        short sheepCount = 300;

        int catCount = 20;

        long mileToMoon = 5000000l;
        long mileToSun = 100000000L;

        //--------------floating point ---------
        // you must add f at the end of number to indicate this is float data type
        // uppercase lowercase does not matter , but it's mandatory
        float priceOfBanana = 1.99f;
        float priceOfPotato = 2.49F;

        //-----------  larger floating point numbers -------
        double priceOfIpad1 = 355.99d;
        double priceOfIpadPro = 1024.99D;
        // compiler automatically assume it's a double so it's not required to have d
        // However for good programming habbit , add them always
        double priceOfMac = 2299.99;


        // If you have a whole number by itself , compiler automatically assume it's an int
        // If you have a fractional number by itself , compiler automatically assume it's an double


    }

}
