package office_hour;


public class Practice_11_14_2 {

    public static void main(String[] args) {


        // ------ Arithmetic operator
        System.out.println(5 + 5);
        // this will result in five + five is 55
        // because it will
        //  first add "five + five is " + 5 -->>"five + five is  5"
        // then add "five + five is  5"+5 -->> five + five is 55
        System.out.println("five + five is " + 5 + 5);

        // correct way to do this is using parenthesis
        System.out.println("five + five is " + (5 + 5));


    }

}
