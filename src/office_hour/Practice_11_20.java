package office_hour;

import java.util.Scanner;

public class Practice_11_20 {

    //Scanner nextX and nextLine method mixture problem
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your age ? ");
        int age = scan.nextInt();

        scan.nextLine(); // this is just to capture the enter keyboard press
        // if you need to make this program run without an issue , enter age and name on same line
        System.out.println("What is your full name ? ");
        String fullName = scan.nextLine();

        System.out.println("Your name is " + fullName + " , your age is " + age);
    }

}
