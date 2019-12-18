package day29;

import java.util.Arrays;

public class FillUpStringArray {

    public static void main(String[] args) {

        // Create an array with size 300 and fill it up with I Love Java
        String[] strArr = new String[300];
        System.out.println("before filling strArr = " + Arrays.toString(strArr));
//        strArr[0] = "I Love Java";
//        strArr[1] = "I Love Java";
//        strArr[2] = "I Love Java";

//        strArr[0] = "1.I Love Java";
//        strArr[1] = "2.I Love Java";
//        strArr[2] = "3.I Love Java";
        // 300
        for (int i = 0; i < strArr.length; i++) {
            //strArr[i] =   "I Love Java";
            strArr[i] = (i + 1) + ".I Love Java";
        }
        System.out.println("strArr = " + Arrays.toString(strArr));

        String str = new String("ABC");   // THIS IS STRING OBJECT WITH VALUE ABC
        String[] strArr2 = new String[5]; // EMPTY STRING ARRAY WITH CAPACITY 5 ,
        strArr2[0] = "i LOVE JAVA";
        strArr2[1] = "i LOVE JAVA";
        strArr2[2] = "i LOVE JAVA";
        strArr2[3] = "i LOVE JAVA";
        strArr2[4] = "i LOVE JAVA";
        System.out.println("strArr2 = " + Arrays.toString(strArr2));


    }

}
