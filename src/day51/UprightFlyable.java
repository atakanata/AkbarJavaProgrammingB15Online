package day51;


// Flyable is super type of UprightFlyable
// Flyable is more general , UprightFlyable is slightly less general but still abstract idea
public interface UprightFlyable extends Flyable {

    //    public abstract void fly();
    public abstract void flyUpright();

}
