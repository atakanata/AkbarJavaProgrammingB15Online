package day56;

public class Test {


    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();


        System.out.println("(s1==s2) = " + (s1 == s2));
        System.out.println("(s2==s3) = " + (s2 == s3));
        System.out.println("(s3==s4) = " + (s3 == s4));
        System.out.println("(s4==s1) = " + (s4 == s1));


//        Singleton s1 = new Singleton();
//        Singleton s1 = new Singleton();
//        Singleton s1 = new Singleton();
//        Singleton s1 = new Singleton();
//        Singleton s1 = new Singleton();


    }


}
