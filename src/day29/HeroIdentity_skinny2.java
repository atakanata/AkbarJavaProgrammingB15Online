package day29;

public class HeroIdentity_skinny2 {

    public static void main(String[] args) {

        // assume this can be different hero
        String hero1 = "Superman-Clark J Kent";
        // hide this hero identity
        //String heroX = "Superman-************";

        // given a String with hero code and name separated by -
        // turn this String into hero code and * with same length as hero name

        // Plain English Logic : ANOTHER WAY !

        // prepare the first part using subString :  Superman-  and store it into heroX
        // get the length of full name
        // concatenate the stars stars with same length as full name character count
        // 1, prepare the first part using subString :  Superman-
        String heroX = hero1.substring(0, hero1.indexOf("-") + 1);
        // count the star using full name length
        for (int i = 1; i <= hero1.split("-")[1].length(); i++) {
            // 2, then concatenate star after :
            heroX += "*";
        }
        //System.out.println("stars = " + stars);

        //String heroX = hero1.replace(heroSplitted[1], stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);


    }


}
