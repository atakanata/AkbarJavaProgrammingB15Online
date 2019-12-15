package day27;

import java.util.Arrays;

public class Multi_Dimesional_Arrats_Practice {

    public static void main(String[] args) {
        //  N dimesional Array MUST contains (N-1) demesional arrays

        // 2 dimensional array MUST contains (2-1) demesional arrays
        //                            0        1              0         1
        String[][] names = {{"Rukhshona", "Ghoya"}, {"Hasan", "Tetiana"}};
        //                              0                              1

        // print Hasan:
        System.out.println(names[1][0]);

        // print Tetiana:
        names[1][1] = "Dilshat";
        System.out.println(names[1][1]);

        // print Hashan & dilshat
        System.out.println(Arrays.toString(names[1]));

        // print: {  {"Rukhshona"  ,"Ghoya" }  ,  {"Hasan", "Tetiana"  }  }
        System.out.println(Arrays.deepToString(names));


    }


}
