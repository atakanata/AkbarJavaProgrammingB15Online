package office_hour;

import java.util.ArrayList;
import java.util.List;

public class Practice_20_01_08_task2 {


    public static void main(String[] args) {

        /**
         *
         * Create a method that accept String object
         *
         * and return List<Character> that contains each character.
         *
         */

        System.out.println(nameCharsToList("Sumeyye"));

        List<Character> resultList = nameCharsToList("Muge");
        resultList.add('M');
        System.out.println("resultList = " + resultList);


    }

    /**
     * a method that accept String object and turn it into List<Character>
     *
     * @param name
     * @return List<Character> that contains each character.
     */
    public static List<Character> nameCharsToList(String name) {

        List<Character> charLst = new ArrayList<>();

        for (int i = 0; i < name.length(); i++) {
            charLst.add(name.charAt(i));
        }

        return charLst;

    }

}
