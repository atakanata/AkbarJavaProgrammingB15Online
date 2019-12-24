package day33;

public class WarmUp {

    public static void main(String[] args) {

//        String spelledName = getSpelledName("Serra");
//        System.out.println("spelledName = " + spelledName);
//        System.out.println(getSpelledName("Zeynep"));

        System.out.println(getSpelledName2("Irina"));

    }

    /**
     * getSpelledName2
     * This method will put dash in between given String
     * for example : Akbar -->> A-k-b-a-r
     *
     * @param name this is the name parameter
     * @return the name has dash in between
     */
    public static String getSpelledName2(String name) {
        String result = "";
        // Keep adding dash until right before last character
        // then concatenate last character
        for (int i = 0; i < name.length() - 1; i++) {
            // this loop will add dash after each character
            // until 2nd character from the last
            result += name.charAt(i) + "-";
        }
        // YOUR CODE GOES HERE
        // result has everything but last character
        // so now we need to add last character back to the result
        return result + name.charAt(name.length() - 1);

    }


    /**
     * getSpelledName
     * This method will put dash in between given String
     * for example : Akbar -->> A-k-b-a-r
     *
     * @param name this is the name parameter
     * @return the name has dash in between
     */
    public static String getSpelledName(String name) {
        // creating a variable for resulting String
        String result = "";
        for (int x = 0; x < name.length(); x++) {

            result = result + name.charAt(x);
            // concatenate dash(-)
            // if we are not at last character
            if (x != name.length() - 1) {
                result = result + "-";
            }

        }
        return result;
    }


}
