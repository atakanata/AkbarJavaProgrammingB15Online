package day13;

public class NestedIf_DoYouWannaShop {

    public static void main(String[] args) {

        // create a boolean store the result of youWantToShop
        // if yes , do you want to go to Store or do you wanna shop online


        // if user do not wanna shop at all , print good job stay home coding !!!!

        boolean youWantToShop = true;
        String preference = "Online";

        //if(youWantToShop )

        if (youWantToShop == true) {


            if (preference.equals("Store")) {
                System.out.println("GOING TO STORE FOR SHOPPING");
            } else {
                System.out.println("GOING TO ONLINE FOR SHOPPING");
            }

        } else {

            System.out.println("good job stay home coding !!!!");


        }


    }


}
