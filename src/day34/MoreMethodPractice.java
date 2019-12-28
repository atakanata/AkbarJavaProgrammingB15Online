package day34;

public class MoreMethodPractice {

    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));

        System.out.println(monkeyTrouble2(true, true));
        System.out.println(monkeyTrouble2(false, false));
        System.out.println(monkeyTrouble2(true, false));

    }

    /**
     * A method that return Yes only if both monkeys are smiling or not smiling
     *
     * @param aSmile
     * @param bSmile
     * @return yes only if both monkeys are smiling or not smiling , no if not
     */
    public static String monkeyTrouble2(boolean aSmile, boolean bSmile) {
        //TODO : Your code goes here
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    /**
     * A method that return true only if both monkeys are smiling or not smiling
     *
     * @param aSmile first monkey smiled or not
     * @param bSmile second monkey smiled or not
     * @return true only if both monkeys are smiling or not smiling
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //TODO : Your code goes here
        return aSmile == bSmile;
//         if (  (aSmile && bSmile) || (!aSmile && !bSmile) )    {
//             return true;
//         }else{
//             return false;
//         }
//        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }


}
