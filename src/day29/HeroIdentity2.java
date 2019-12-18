package day29;

public class HeroIdentity2 {

    public static void main(String[] args) {

        // assume this can be different hero
        String hero1 = "Superman-Clark J Kent";
        // hide this hero identity
        //String heroX = "Superman-************";

        // given a String with hero code and name separated by -
        // turn this String into hero code and * with same length as hero name

        // Plain English Logic :

        // split it by - to get the code and full name
        // get the length of full name
        // generate stars with same length as full name character count
        // one the star is generated , replace full name with Stars

//        String[] heroSplitted = hero1.split("-");
//        String heroCode = heroSplitted[0];
//        String fullName = heroSplitted[1];

        String stars = "";
        for (int i = 1; i <= hero1.split("-")[1].length(); i++)
            stars += "*";

        //System.out.println("stars = " + stars);

        //String heroX = hero1.replace(heroSplitted[1], stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + hero1.replace(hero1.split("-")[1], stars));


    }


}
