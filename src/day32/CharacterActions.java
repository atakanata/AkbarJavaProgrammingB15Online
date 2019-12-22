package day32;

public class CharacterActions {

    public static void main(String[] args) {

//        printAtoZ();
//        printZtoA();

        printAlphabetInRange('a', 'f');
        printAlphabetInRange('G', 'B');
        printAlphabetInRange('A', 'A');
        printAlphabetInRange('a', 'A');
        printAlphabetInRange('Z', 'a');


    }

    /**
     * if beginning character is before ending character
     * for example beginning A , ending D  -->> ABCD
     * we did similar action with printing A-Z
     * <p>
     * if beginning character is after ending character
     * for example beginning D , ending A  -->> DCBA
     * we did similar action with printing Z-A
     */
    public static void printAlphabetInRange(char beginning, char ending) {
        // this mean beginning character comes before ending character
        // in ascii table
        if (beginning < ending) {
            System.out.println("WE NEED TO INCREMENT FROM " + beginning + " till " + ending);

            for (char iChar = beginning; iChar <= ending; iChar++) {
                System.out.print(iChar + " ");
            }
            System.out.println();
            // this mean beginning character comes after ending character
            // in ascii table
        } else if (beginning > ending) {
            System.out.println("WE NEED TO DECREMENT FROM " + beginning + " till " + ending);

            for (char iChar = beginning; iChar >= ending; iChar--) {
                System.out.print(iChar + " ");
            }
            System.out.println();

        } else {
            System.out.println("THEY ARE SAME CHARACTER!!!!");
        }
    }


    /*
    * printAtoZ
    * create a method that has no parameter
	    and print A-Z in one line
    *
    * */
    public static void printAtoZ() {
        //'A'++ -->> 'B'
        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print(iChar + " ");
        }
        System.out.println();// so we can move to next line
    }

    /*
    * printZtoA
    * create a method that has no parameter
	    and print Z-A in one line
    *
    * */
    public static void printZtoA() {
        // this is how we can print in descending order
        // 'Z'--  -->> 'Y'
        for (char iChar = 'Z'; iChar >= 'A'; iChar--) {
            System.out.print(iChar + " ");
        }
        System.out.println();// so we can move to next line
    }


}
