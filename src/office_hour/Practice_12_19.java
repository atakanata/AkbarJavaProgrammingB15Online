package office_hour;

import java.util.Arrays;

public class Practice_12_19 {

    /*
    1. write a program that can check if a string is build out of the same letters as another string
		Ex: input:
				str1 = "abc";
				str2 = "cba";
			output:
				true

    2. Write a program that will remove all the dupplicates from a string
				Do it withg Arrays only

	3. given the array of names:
			String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
	   write a program that can remove all the names named Ahmed from the array
	   Ex:
	   		names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
	   		System.out.println( Arrays.toString(names) );
	   		output:
	   			[John, Eric, Hassan]
     */

    public static void main(String[] args) {

        int a = 'A';
        int[] arr = {10, (byte) 9, (short) 8, 'a'}; // data MUST match with the data type	of the array
        System.out.println(Arrays.toString(arr));

        long l1 = 100;  // implicit: by default 100 is an integer, and we assign it to long data type
        int num1 = (int) l1;  // explicit

        System.out.println(arr[arr.length - 1]);  // data at last index: 97

        int[] arr2 = {0, 0, 0};
        for (int each : arr2) {
            System.out.println(each); // 0  0  0
        }

        System.out.println("================================");
        for (int i = 0; i < 4; i++) {

            System.out.println(i);

            if (i == 2)
                continue;

            System.out.println(i + " is printed");

        }
        System.out.println("================================");

        for (int i = 0; i < 4; i++) {

            System.out.println(i); //0  1  2

            if (i == 2) {
                break;  // exits the loop IMMEDIETLY
            }

            //    System.out.println(i); //0 1

        }


        System.out.println("================================");
        //task1:  write a program that can check if a string is build out of the same letters as another string
        String str1 = "abc", str2 = "cba";  // expected result: true

        // split(), toCharArray();

        char[] ar1 = str1.toCharArray(); // [a, b, c];
        Arrays.sort(ar1);  // arr1: [a, b, c]

        char[] ar2 = str2.toCharArray(); // [c,b,b]
        Arrays.sort(ar2);  //[b, b, c]

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        System.out.println(Arrays.equals(ar1, ar2));

        str1 = Arrays.toString(ar1);
        str2 = Arrays.toString(ar2);

        System.out.println(str1.equals(str2)); // false

        System.out.println("================================");
        // task02: Write a program that will remove all the dupplicated characters from a string. (DO it with arrays
        String s1 = "aabbcc";    // expected result:abcd
        String s2 = "";   // we store non duplicated characters in it
//          s2 ="abc"

        for (int i = 0; i < s1.length(); i++) {
            String eachChar = "" + s1.charAt(i);  //b
            if (!s2.contains(eachChar)) {
                s2 += eachChar;  // we only concat the character if that character is not exist in s2
                //s2: "a"
            }

        }

        System.out.println(s2);


        // solution two
        String fiveMinutes = "abcabcdeedddeeefffffjjjj";
        String[] EachChar = fiveMinutes.split("");
        String result = "";  // to store all non duplicated String objects of the array

        for (String each : EachChar) {
            if (!result.contains(each)) {
                result += each;
            }
        }

        System.out.println(result);


    }


}
