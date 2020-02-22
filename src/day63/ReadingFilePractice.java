package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {

    public static void main(String[] args) throws IOException {


        List<String> allData = Files.readAllLines(Paths.get("src/day63/employeeData.txt"));

        Map<Integer, String> idNamePair = new HashMap<>();

        for (String eachLine : allData) {
            // cutting the String into two part and parsing first part to number
            // saving second part to name
            int id = Integer.parseInt(eachLine.split(",")[0]);
            String name = eachLine.split(",")[1];
            //adding the data into the map
            idNamePair.put(id, name);

        }

        System.out.println("idNamePair = " + idNamePair);
        // get the person with employee id with number 20
        System.out.println("idNamePair.get(20) = " + idNamePair.get(20));

        // 1,Lilian  ---  1    Lilian
//        allData.forEach(eachLine-> System.out.println("eachLine = " + eachLine););


    }

}
