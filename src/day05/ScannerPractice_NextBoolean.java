package day05;


import java.util.Scanner;

public class ScannerPractice_NextBoolean {

    public static void main(String[] args) {

        // creating scanner object
        Scanner input = new Scanner(System.in);

        // asking user are you recording
        System.out.println(" are you recording ? ");
        boolean isRecording = input.nextBoolean();

        // The result of concatenating a string to any data type -->> String
        System.out.println("We are recording  " + isRecording);


    }

}
