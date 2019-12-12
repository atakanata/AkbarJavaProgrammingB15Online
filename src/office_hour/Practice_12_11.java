package office_hour;

public class Practice_12_11 {
    /*
    {"apple","banana","grape","strawberry","blueberry","kiwi"}
    1, loop through each grocery items and print them in one line
          1.1 print each items at odd index
          1.2 print all items in reverse order
          1.3 find out the index location of strawberry
          1.4 find out the count of groceries that contains berry in the name
          1.5 print out all the character counts of the grocery items
          1.6 print out only those items with even character count
          1.7 print out only those items end with letter e   //
          1.8 print out only last 3 characters of all the items
          1.9 create String variable called allItems and store all the items inside array separated by comma.

        { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
        2, loop through each prices  and print them in one line
            2.1 print each prices in even index
            2.2 print only prices less that 3 dollars
            2.3 print the sum of all the prices and get average
            2.4 print only the second half of prices (last 3)
            2.5 print the sum of the middle two prices
            2.6 print only prices more than average price
            2.7 find out max price and print out max price and  index of max price
            2.8 find out the minimum price and index of minimum price
            2.9 find out second max price and index(challenging)


        3, assume that the order of grocery Items match the prices in same order do below:
            3.1 print first item and first price in one print statement -->>  apple price is 1.99
            3.2 print last item and last price in one print statement-->>  kiwi price is 2.88
            3.2 print all items and prices in one for loop together
            3.3 print only those items with price more than 3.11
            3.4 print only those items with price more than average
            3.5 print only those prices of grocery items that contains letter b
            3.6 print the item name with max price
            3.7 print the item name with min price

     */

    public static void main(String[] args) {
        //                                               length-3              length-2        length-1
        String fruits[] = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        // index:               0       1        2         3              4         5
        // length-3  ==>3

        // length: return the total number of elements

        // 1.7 print out only those items end with letter e
        for (int i = 0; i < fruits.length; i++) { // i: 0, 1, 2, 3, 4, 5
            String str = fruits[i];
             /*
                if(str.endsWith("e")) {
                    System.out.println(str);
                }
              */
            if (!str.endsWith("e")) {
                continue;
            }
            System.out.println(str);
        }

        System.out.println("======================================");
        /*
            for( Variable : Collection of data) {
                    statements;
            }
            variable MUST be representing each elements of the collection of data

         */

        //  {"apple", "banana","grape","strawberry","blueberry","kiwi"};
        for (String eachFruit : fruits) {
            char lastChar = eachFruit.charAt(eachFruit.length() - 1);  // represents the last character of each string
            if (lastChar == 'e') {
                System.out.println(eachFruit);
            }
        }

        System.out.println("======================================");

        //  1.8 print out only last 3 characters of all the items
        for (int i = 0; i < fruits.length; i++) {
            String last3 = fruits[i].substring(fruits[i].length() - 3, fruits[i].length());
            System.out.println(last3);
        }

        System.out.println("======================================");

        for (String eachFruit : fruits) {
            // String last3 = eachFruit.substring( eachFruit.length()-3  );
            String last3 = "" + eachFruit.charAt(eachFruit.length() - 3) + eachFruit.charAt(eachFruit.length() - 2) + eachFruit.charAt(eachFruit.length() - 1);
            System.out.println(last3);
        }
        System.out.println("======================================");

        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        // index:                0,       1,         2,       3,         4,       5

        float max = prices[0]; // 4.65

        for (float eachPrice : prices) {
            if (eachPrice > max) {
                max = eachPrice;
            }
        }

        System.out.println(max);

        System.out.println("======================================");
        float Max = prices[0];
        for (float eachPrice : prices) {
            if (eachPrice < Max) {
                continue;
            }
            Max = eachPrice;

        }
        System.out.println(Max);

        System.out.println("======================================");

        // finding the second maximum number from the array

        float SecondMax = prices[0];   // store the second max number

        for (float eachPrice : prices) {
            if (eachPrice > SecondMax && eachPrice < max) {
                SecondMax = eachPrice;
            }
        }

        System.out.println(SecondMax);

        // find the index number of second maximum number
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == SecondMax) {
                System.out.println("index number of " + SecondMax + " is: " + i);
            }
        }

        // find the index num of max price
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == max) {
                System.out.println("index number of " + max + " is: " + i);
            }
        }

    }

}
