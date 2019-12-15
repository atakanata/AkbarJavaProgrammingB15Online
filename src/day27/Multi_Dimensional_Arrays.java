package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {

    /*
        Single dimensional array: contains vaules
                int[] arr = {1, 2, 3};

        Multi-dimensional array: an Array that can contain array(s)
                            N dimesional Array MUST contains (N-1) demesional arrays

                    ex: 2 dimesional array: conatins 1 dimesional arrays
                            int[][] arr2D = { {1,2,3 } , {4, 5, 6 }   }




     */

    public static void main(String[] args) {
        int[] arr1D = {1, 2, 3};
        //[index num of elemnts]
        //arr1D[1]  ==> 2

        System.out.println(Arrays.toString(arr1D));


        // 2D array: is an array that contains single dimensional arrays
        //                     0  1  2       0   1   2
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        // index:               0              1

        //[INDEX NUM OF 1D ARRAYS][INDEX NUM OF ELEMENTS]

        // arr2D[0] ==> {1,2,3}
        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));  // returns int array
        System.out.println(Arrays.toString(arr2D[1]));

        // arr2D[0][2]  ==> 3
        System.out.println(arr2D[0][2]);   // returns int value

        // print 5: arr2D[1][1]
        System.out.println(arr2D[1][1]);  // retunrs int value


        System.out.println(Arrays.toString(arr2D[1])); // Arrays.toString is only applicable to single dimensional arrays

        // Arrays.deepToString(multi-D Arrays):
        System.out.println(Arrays.deepToString(arr2D));


    }


}
