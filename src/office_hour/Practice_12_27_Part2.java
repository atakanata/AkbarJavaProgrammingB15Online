package office_hour;

public class Practice_12_27_Part2 {

    /*
        1. write a method that can convert km to miles
	 				Hint: 1 km = 0.612 miles

	 	2. write a method that can convert gallons to litters
	 			   Hint: 1 G = 3.75 L
	 	3. write a method that can print out the array in Descending order
	 	4. write a method that accepts 3 parameters: 2 numbers and one operator,
	 	and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
			Ex: calculate(10, 2, "*") ==> 20;
				calculate(20, 2, "~") ==> invalid operator
		5. write a method that can calculate grade
					if score is 100 ~ 90 ==> A
					if score is 89 ~ 80 ==> B
					if score is 79 ~ 70 ==> C
					if score is 69 ~ 60 ==> D
					if score is 0 ~ 59 ==> F
					otherwise ==> Invalid Score
     */

    public static void main(String[] args) {
        OddEven(77);

        System.out.println(ConvertKmToMiles(1));

        System.out.println(ConvertGallonToLitters(100));

    }


    // write method that can verify any number  if it's even or odd
    public static void OddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
            return;
        }

        System.out.println(number + " is odd number");
    }


    // Task01:  1. write a method that can convert km to miles
    //	 				Hint: 1 km = 0.612 miles

    public static double ConvertKmToMiles(double km) {
        double miles = km * 0.612;
        return miles;
    }

    // Task02: write a method that can convert gallons to litters
    //	 			   Hint: 1 G = 3.75 L

    public static double ConvertGallonToLitters(double galons) {
        double litters = galons * 3.75;

        return litters;
    }


}
