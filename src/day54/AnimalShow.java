package day54;

public class AnimalShow {

    public static void main(String[] args) {
// Dog IS-A Dog
// Dog IS-A Animal
// Dog IS-A Object
// Dog IS-A IndoorPet
        // refer a dog object as a dog
        // it can do everything a dog can do (including Animal, IndoorPet stuff)
        Dog d1 = new Dog();
        System.out.println(d1.name);
        d1.speak();
        d1.play();
        // refer a dog object as a Animal
        // it can do only those thing Animal can do
        // only the speak method in this case
        Animal a1 = d1;
        a1.speak();

        // refer a dog object as a Object
        // it can do only those thing Object can do
        // for example toString, hasCode and others
        Object o1 = d1;
//        o1.speak();
        // refer a dog object as a IndoorPet
        // it can only play
        IndoorPet p1 = d1;
        p1.play();


    }

}
