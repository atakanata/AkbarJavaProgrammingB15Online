package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        //pseudo| sudo code
        /*
         * given your currentSpeed , speedLimit
         *
         * check whether the current speed is

         *
         * -----  start from here above two optional
         *   more than 70  --> point taken
         *   more than 60 and less than 70  --> warning
         *   if not speeding keep driving
         * */
        int currentSpeed = 45;
        if (currentSpeed > 70) {
            System.out.println(" you are speeding more than 70 --POINTS TAKEN!!!!");
            // asking whether it's less than or equal 70 and more than 60
            // when you come to this point , your speed is already not more than 70
        } else if (currentSpeed > 60) {
            System.out.println("your speed is less than or equal 70 but more that 60 ");
        } else {
            System.out.println("KEEP DRIVING YOU ARE GOOD !!!");
        }

//        // 45 , 65 , 90    BAD IDEA , CONDITION SHOULD BE ALWAYS STARTING WITH TOP TO BOTTOM OR
//        // MORE SPECIFIC TO MORE GENERIC
//        int currentSpeed = 45 ;
//        if( currentSpeed> 60  ) {
//            System.out.println( " you are speeding more than 60 --POINTS TAKEN!!!!" );
//        // asking whether it's less than or equal 70 and more than 60
//            // when you come to this point , your speed is already not more than 70
//        }else if ( currentSpeed > 70 ){
//            System.out.println("your speed is MORE THAN 70 ");
//        } else {
//            System.out.println("KEEP DRIVING YOU ARE GOOD !!!");
//        }


    }


}
