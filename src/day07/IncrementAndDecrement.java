package day07;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        /*
        * / —— The special case of increasing and decreasing numbers by 1
            //. —>> increment and decrement operator come in :  ++ - -

              int  offer = 2 ;

              offer += 1 ;    // 3
              ++ offer ;       // 4   ++ will increase the number variable by 1 in shortcut

        * */

        int apple = 10;
        System.out.println("original apple is " + apple);

//        apple = apple + 1 ;
//        apple +=1 ;
        ++apple;  // this is increasing the value by one in shortcut using ++
        ++apple;
        System.out.println("used ++ twice then apple is  " + apple);


        // apple = apple -1 ;
        // apple -= 1 ;
        --apple;
        System.out.println("used -- once then apple is  " + apple);

        //System.out.println( ++apple );
        // in below case first plus is for concatenation and second ++ is for increment
        System.out.println("used ++ to increment and concatenate : " + (++apple));


    }

}
