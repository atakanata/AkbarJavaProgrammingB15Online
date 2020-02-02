package day52.warmup;

public class BankTest {

    public static void main(String[] args) {

        Account a1 = new Account("John Snow", 10000);
        Account a2 = new Account("Hannah", 7000);

        System.out.println("a1 before = " + a1);
        System.out.println("a2 before  = " + a2);

        a1.transferAll(a2);
        System.out.println("a1 after =  " + a1);
        System.out.println("a2 after = " + a2);

        a2.transferAll(a1);
        System.out.println("a1 after 2nd transfer =  " + a1);
        System.out.println("a2 after 2nd transfer =  " + a2);

        System.out.println("Does a1 has palindrome name : " + a1.isPalindrome());
        System.out.println("Does a2 has palindrome name : " + a2.isPalindrome());


    }

}
