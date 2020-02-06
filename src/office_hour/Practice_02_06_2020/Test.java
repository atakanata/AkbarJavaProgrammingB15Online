package office_hour.Practice_02_06_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface A {

}

public class Test {


    public static void main(String[] args) {

        Kentucky obj1 = new Kentucky();
        obj1.KFC();
        obj1.tax();

        States obj2 = new Kentucky();
        obj2.tax();
        // obj2.KFC();  // reference type decides what can be called

        States obj3 = new California();
        obj3.tax();
        obj3.method1();

        List<Kentucky> list = new ArrayList<>();
        list.addAll(
                Arrays.asList(
                        new Kentucky()
                )
        );

        String name1 = list.get(0).stateName;

        System.out.println(name1);


        States[] arr = {new Kentucky(), new California()};


        //     Kentucky obj4  = new States();
        // sub class cannot be reference to super class' object


    }


}

abstract class B implements A {

    public static void main(String[] args) {
        //   A obj = new B();  // super-type can be reference to child class object

        //  B obj2 = new A();  // cannot create object from interface


    }

}


class C {

}

abstract class D extends C {
    public static void main(String[] args) {
        //  C obj1 = new D();
    }
}



