package day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {


        String[] marvelHeroes = {"Iron Man", "Captain America", "Spider man",
                "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spider man",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeroes));
        int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero count = " + sizeOfArray);

        String itemToSearch = "Black Widow";
        int countOfItem = 0;

        for (String eachHero : marvelHeroes) {

            if (eachHero.equals(itemToSearch)) {
                countOfItem++;
            }

        }
        System.out.println("countOfItem = " + countOfItem);
        // COUNT THE HERO WITH WITH THE NAME CONTAINS BLACK IN CASE INSENSITIVE MANNER
        int cntOfBlackInName = 0;

        for (String eachHero : marvelHeroes) {
            // in order to not care about the case , make all lowercase then check contains
            if (eachHero.toLowerCase().contains("black")) {
                cntOfBlackInName++;
            }

        }
        System.out.println("cntOfBlackInName = " + cntOfBlackInName);







    }


}
