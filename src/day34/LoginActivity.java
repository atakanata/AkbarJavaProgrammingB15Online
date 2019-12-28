package day34;

public class LoginActivity {

    public static void main(String[] args) {

        loginVoid("my username", "abc123");
        loginVoid("user", "abc123");
        boolean result = loginReturn("user", "abc123");
        System.out.println("result = " + result);

        System.out.println("second run " + loginReturn("aaaa", "bbb"));
        // System.out.println(    loginVoid("aaaa" , "bbb")    ); CAN NOT DO IT WITH VOID METHOD
        //boolean result2 = loginVoid("abc","efg"); // no result to save!

        // we want to continue with shopping scenario only if user signed in to the app
        if (loginReturn("user1", "abc123")) {

            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View The order ");

        } else {
            System.out.println("NO SHOPPING UNLESS YOU SIGNED IN!!!!!!");
        }

    }

    /**
     * A method that check username and password and print the result
     *
     * @param user
     * @param password
     */
    public static void loginVoid(String user, String password) {

        if (user.equals("user") && password.equals("abc123")) {
            System.out.println(" LOG IN SUCCESSFUL");
        } else {
            System.out.println(" LOG IN FAILED");
        }

    }

    /**
     * A method that check username and password and generate result
     * @param user
     * @param password
     * @return true only if user name and password are : user / abc123
     */
    public static boolean loginReturn(String user, String password) {

        return user.equals("user") && password.equals("abc123");

    }

//        if (user.equals("user") && password.equals("abc123")  ){
//            return true;
//        }else {
//            return false;
//        }

}
