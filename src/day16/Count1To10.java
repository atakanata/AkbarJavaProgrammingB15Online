package day16;

public class Count1To10 {

    public static void main(String[] args) {

        int counter = 1;

        while (counter < 11) {

            System.out.println("Counter values : " + counter);
            // SOMETHING HAS TO BE DONE TO CHANGE THE CONDITION ALONG THE WAY
            // OR IT JUST KEEP RUNNING FOREVER
            ++counter;

        }


    }

    //  10 <=10 -->> true     11 <= 10 false
    //  10 < 11 -->> true     11 <  11 false

}
