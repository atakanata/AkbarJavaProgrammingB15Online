package day14;

public class EmailChecker {

    public static void main(String[] args) {

//        Create a class called EmailChecker with main method:
//
//        create a variable called email
//
//        check for below conditions
//
//        if it does not contain character @  say invalid email
//        if it contain space say invalid email

//        if it endsWith @gmail.com  -->> print gmail
//        if it endsWith @yahoo.com  -->> print yahoo email
//        if it endsWith @mail.ru  -->> print russian email
        String email = "abc@gmail.com";

        if (!email.contains("@") || email.contains(" ")) {

            System.out.println("invalid email");

        } else if (email.endsWith("@gmail.com")) {

            System.out.println("Google Mail ");

        } else if (email.endsWith("@yahoo.com")) {

            System.out.println("Yahoo Mail");

        } else if (email.endsWith("@mail.ru")) {

            System.out.println("Russian mail");

        }


    }

}
