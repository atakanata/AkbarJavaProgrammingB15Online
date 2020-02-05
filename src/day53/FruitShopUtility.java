package day53;

public class FruitShopUtility {


    public static void main(String[] args) {


        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        displayFruit(f2);
        // can we directly pass any object IS-A Fruit rather than saving it into a variable
        displayFruit(new Apple("tasteless", "red", "Golden"));

        System.out.println("----------digest better call ----------------");
        digestBetter(f2);
        digestBetter(new Orange("sweet", "yellowish", 1));


    }

    // Create a static method called getMyFavoriteFruit
    // accept no parameter and return your Favorite Fruit Object
    public static Fruit getMyFavoriteFruit() {

        //Fruit f = new Orange("cripsy", "green", 100);
//        Fruit f = new Apple("Sweet", "blue", "Ginger");
//        return f;
//        return new Orange("cripsy", "green", 100);
        return new Apple("Sweet", "blue", "Ginger");
    }

    // Create a static void method called digestBetter
    // it has a parameter as type Fruit
    // and inside the method , it will digest the Fruit object 4 time then displayInformation
    public static void digestBetter(Fruit anyFruit) {

        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();
        System.out.println("anyFruit = " + anyFruit);

    }


    // displayFruit
    public static void displayFruit(Fruit anyFruit) {

        System.out.println("Displaying fruit \n" + anyFruit.toString());

    }


    // sellFruit


    // buyFruit


}
