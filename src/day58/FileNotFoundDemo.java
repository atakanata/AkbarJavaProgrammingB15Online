package day58;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("Before Try catch");
        Files.readAllLines(Paths.get("file.txt"));

//        try {
//            Files.readAllLines(Paths.get("file.txt"));
//        }catch(IOException e){
//            System.out.println("Exception happened and caught!");
//        }

        System.out.println("After try catch");
    }

}
