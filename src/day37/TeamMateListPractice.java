package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMateListPractice {

    /**
     * Warm up:
     * Create Arraylist of String and store
     * teamMates
     * print one by one
     * print reverse
     * print first last
     * print 2 at a time
     * concat everyone in one string separated by -
     */
    public static void main(String[] args) {

        //ArrayList<String> teamMates = new ArrayList<>();
        List<String> teamMates = new ArrayList<>();

        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Murodil");
        teamMates.add("Maruf");
        teamMates.add("Vasyl");
        teamMates.add("Muhtar");
        teamMates.add("Asiya");
        teamMates.add("Mike");
        teamMates.add("Guljannat");
        teamMates.add("Support Team");


        System.out.println("teamMates = " + teamMates);

        // first item
        System.out.println("First Item = " + teamMates.get(0));
        //  last item--> using last index -->> size()-1
        int lastItemIndex = teamMates.size() - 1;
        System.out.println("lastItemIndex = " + lastItemIndex);
        System.out.println("Last Item = " + teamMates.get(lastItemIndex));

        // print one by one
        System.out.println("\nALL ITEMS : ");
        for (int x = 0; x < teamMates.size(); x++) {

            System.out.println("\tItem " + (x + 1) + " = " + teamMates.get(x));

        }
        System.out.println("\nALL ITEMS in reverse order: ");
        for (int x = lastItemIndex; x >= 0; x--) {

            System.out.println("\tItem " + (x + 1) + " = " + teamMates.get(x));

        }

        // print 2 items at a time
        // for example :  1-2 , 2-3 , 3-4 , 4-5 , 5-6 ....
        System.out.println("\nPrint 2 items at a time : ");
        for (int x = 0; x <= teamMates.size() - 2; x++) {
            //System.out.println("x and x+1 = " + x + "---" + (x+1) );
            System.out.println("\t" + teamMates.get(x) + "---" + teamMates.get(x + 1));

        }

        // print 2 items at a time
        // for example :  1-2 ,  3-4 , 5-6, 7-8 , 9-10
        System.out.println("\nPrint 2 items at a time without repeating: ");
        for (int x = 0; x <= teamMates.size() - 2; x += 2) {

            //System.out.println("x and x+1 = " + x + "--" + (x+1) );
            System.out.println("\t" + teamMates.get(x) + "---" + teamMates.get(x + 1));

        }

        // Challenge : Pair them up by 3

        // concat everyone in one string separated by -
        String result = "";
        for (int i = 0; i < teamMates.size(); i++) {

            result = result + teamMates.get(i) + "-";

        }
        System.out.println("result = " + result);
        //TODO : Remove the last Dash


    }

}
