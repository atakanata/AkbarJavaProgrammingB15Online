package day60;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class DangerZoneAgain2 {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("THE START");

        readMyFile();

        Thread.sleep(3000);
        System.out.println("The end ");

    }
    // document this method to tell the caller , the file you are about to read might not exists
    // and handle the consequences yourself
    // the exception type already exists for this type of situation is called
    // FileNotFoundException from java.util package

    // FileNotFoundException extends IOException
    public static void readMyFile() {

        System.out.println("Reading the file in my computer");

        try {
            // we are throwing a checked exception
            // so IT MUST BE HANDLED OR DECLARED , Here we chose to handle it with try catch
//            throw new FileNotFoundException("Kaboom ! file is not here!!! ");
            List<String> allLines = Files.readAllLines(Paths.get("src/day60/hero.txt")); // moved the file under day60
            System.out.println("allLines = " + allLines);
//        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            System.out.println("AHA !! CAUGHT YOU IN readMyFile !!!");
        }
    }


}
