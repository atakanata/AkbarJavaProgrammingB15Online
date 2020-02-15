package day59;

public class CheckedAnUnchecked2 {


    // checked exception must be handled or declared

    // handle -->> try catch
    // declare -->> add it to the method signature to document

    public static void main(String[] args) throws InterruptedException {//} throws IOException {

        String x = "abc";
        System.out.println("START");
//        try {

//            throw new IOException("just throwing this away");
        Thread.sleep(3000);


        System.out.println("End");

//        } catch (IOException e) {
//            System.out.println("Exception caught");
//        }


    }


}
