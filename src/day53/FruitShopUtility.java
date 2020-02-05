package day53;

public class FruitShopUtility {


    public static void main(String[] args) {

        Fruit fx = null;  //new Orange("sour", "orange", 12);// new Apple("crispy but tasteless", "hot red", "Gala");

        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        displayFruit(f2);
        // can we directly pass any object IS-A Fruit rather than saving it into a variable
        displayFruit(new Apple("tasteless", "red", "Golden"));

        System.out.println("----------digest better call ----------------");
//        digestBetter(f2);
////        digestBetter(new Orange("sweet", "yellowish", 1));

        System.out.println("----------getMyFavoriteFruit call ----------------");
        Fruit x = getMyFavoriteFruit();
        x.getDigested();
        System.out.println("B15 Favorite Fruit = " + x);

        System.out.println("----------getFavoriteByType call ----------------");
        System.out.println("getFavoriteByType(1) = " + getFavoriteByType(1));
        System.out.println("getFavoriteByType(2) = " + getFavoriteByType(2));
        System.out.println("getFavoriteByType(2) = " + getFavoriteByType(3));

    }


    // Create a static method called GetFavoriteByType
    // it has one int parameter
    // return favorite apple object if type is 1 , orange object if type 2
    public static Fruit getFavoriteByType(int type) {

        if (type == 1) {
            return new Apple("Sweet", "blue", "Ginger");
        } else if (type == 2) {
            return new Orange("cripsy", "green", 100);
        } else {
            // we can return null for any method that return reference type
            // because null can be assigned to a reference type variable
            return null;
        }
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
