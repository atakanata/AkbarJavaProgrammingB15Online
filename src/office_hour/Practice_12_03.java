package office_hour;

public class Practice_12_03 {

    public static void main(String[] args) {
//             //     1                2 5             4
//        for (int jumpCount = 1; jumpCount <= 100; jumpCount++){
//             //3  6
//            System.out.println("I jumped " + jumpCount + " times");
//        }


        // stack --> JumpCout ->2+1 =3+1 = 4 99 100 101

        //3rs stairs  --> 7th
        //sing a song, drink water,  clap


//        for(int stairs = 3; stairs <=  7; stairs++){
//            System.out.println("sing a song");
//            System.out.println("Drink water ");
//            System.out.println("clap");
//            System.out.println("You are done with staris " + stairs);
//        }

        // int stairs = 3;
        //   stairs <=  7
  /*        System.out.println("sing a song");
            System.out.println("Drink water ");
            Sy

   */

        //task : print 23 - 30
        for (int point = 23; point <= 30; point++) {
            System.out.println(point);
        }

        // I am in level 90 89 88 ------   80
        for (int level = 90; level >= 80; level--) {
            System.out.println("I am in level " + level);
        }

        // 1 -- 10  even number?   2 4 6 8 10

        for (int num = 1; num <= 10; num++) {
            //10 %2 ? 0
            if (num % 2 == 0) {
                System.out.println(num); //2       10
            }

        }
        // num = 1+1 == 2+1 ==3+1 ==4     8+1 =9+1 = 10+1 == 11


        for (int number = 1; number <= 10; number += 2) {
            System.out.println(number);//1 3 5 7  9
        }


        //1 +2 == 3+2 == 5+2  == 7+2 == 9+2 == 11


    }


}
