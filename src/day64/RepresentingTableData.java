package day64;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RepresentingTableData {

    public static void main(String[] args) {

        // for single row
        // i want to get the value by it's column name
        // so i choose Map

        Map<String, String> row1 = new LinkedHashMap<>();
        row1.put("first_name", "Regan");
        row1.put("email", "rboichat0@1688.com");
        row1.put("gender", "Female");

        Map<String, String> row2 = new LinkedHashMap<>();
        row2.put("first_name", "Carleen");
        row2.put("email", "cmorillas1@blog.com");
        row2.put("gender", "Male");

//        System.out.println("row1 = " + row1);
//        System.out.println("row2 = " + row2);

        // for one row I used one map
        // but I have many rows !
        // may of Some type -->> List<SomeType>
        List<Map<String, String>> rowMapLst = new ArrayList<>();
        rowMapLst.add(row1);
        rowMapLst.add(row2);

        System.out.println("rowMapLst = " + rowMapLst);
        // How do I get 2nd row email column value
        System.out.println("rowMapLst.get(1).get(\"email\") = "
                + rowMapLst.get(1).get("email"));

        // update the Name of 1st row to Hulk
        rowMapLst.get(0).replace("first_name", "Hulk");
        System.out.println("rowMapLst = " + rowMapLst);
        rowMapLst.get(0).put("first_name", "Jane");
        System.out.println("rowMapLst = " + rowMapLst);


    }

}
