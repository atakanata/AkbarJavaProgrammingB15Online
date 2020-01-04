package day36;

public class MethodWithParameter {

    public static void main(String[] args) {

        //addOneHundred(new Integer(100) );
//        int num = 7 ;
//        addOneHundred( num );

//        addOneHundred(25);
        int num = 10;
        addOneHundred(num);
        System.out.println(num);

        num = addOneHundredAndReturn(num);
        System.out.println(num);

    }

    // this is what happen when we pass num to a method
//    public static void addOneHundred( ) {
//        x will copy whatever is inside num and assign it to num
//        int x = num ;
//        x = x + 100 ;  // if you change the value of x, does it change value of num
//        System.out.println( x );
//
//    }

    public static void addOneHundred(int x) {
        x = x + 100;
        System.out.println(x);

    }

    public static int addOneHundredAndReturn(int x) {
        x = x + 100;
        //System.out.println( x );
        return x;
    }


//    public static void addOneHundred( int x) {
//
//        System.out.println( x + 100);
//
//    }
    //  this is what happen at run time when you pass num
//    public static void addOneHundred() {
//         int x = num ;  -->> int x = 7
//        System.out.println( x + 100);
//
//    }


//  this is what happen at run time when you pass new Integer(100)
//    public static void addOneHundred() {
//         int x = new Integer(100) ;
//        System.out.println( x + 100);
//
//    }


}
