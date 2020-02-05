package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyFruits {


    public static void main(String[] args) {


        Fruit f1 = new Apple("sweet", "red", "Fuji");
        // Fruit is reference type , Apple is actual object Type
        Fruit f2 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f3 = new Orange("sour", "orange", 12);
        Fruit f4 = new Orange("very sweet", "Blood Red", 10);

        Fruit[] muFruits = {f1, f2, f3, f4};

        for (Fruit each : muFruits) {

            each.getDigested();

        }
        // in this way , it's not resizable | adding removing will not work | everything else work
        //List<Fruit> fruitList = Arrays.asList(f1,f2,f3,f4) ;
        // this is a just a regular list with 4 item pre-filled
        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(f1, f2, f3, f4));

        for (Fruit each : fruitList) {

            System.out.println("each.toString() = " + each.toString());
            System.out.println("Class Type : " + each.getClass().getSimpleName());

        }


    }


}
