package day60;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReading {


    // First create a file by right clicking day60 package and select new -- File
    // name your file as note.txt
    // enter few line of text
    // close the file (it might ask you to save , if it did not it means it already saved)
    // then use
    // List<String> allLines = Files.readAllLines(Paths.get("src/day60/note.txt"));
    // the method declare to throw checked exception so HANDLE OR DECLARE  !!
    // for reading the file and storing it into the list
    // make sure the path is correct , if not , it will throw exception
    // print out the list content using loop to see whats inside line by line

    public static void main(String[] args) throws IOException {

        // reading a file is one line of code as below
        // it return List of String as each line as element
        try {
            List<String> allLines = Files.readAllLines(Paths.get("src/day60/note.txt"));
            System.out.println("allLines = " + allLines);

            for (String eachLine : allLines) {
                System.out.println(eachLine);
            }
        } catch (Exception e) {
            System.out.println("BOOM!!");
            System.out.println(e.getMessage());
        }

    }

}
