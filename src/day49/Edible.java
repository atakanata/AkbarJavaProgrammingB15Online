package day49;

// interface is like a contract ,
// once someone sign a contract he/she will provide all the details that he/she must do

// AN INTERFACE IS NOT A CLASS!!!!!!
public interface Edible {

    // IN INTERFACE fields are automatically public static final if not defined so.
    // public static final filed naming convention is ALL_CAPS!!!
    // You can have as many constants as you want
    public static final boolean IS_HUMAN_FOOD = true;


    // If a method with no-body is not defined public abstract , it's automatically public abstract
    public abstract void eat();

    public abstract void drink();

    public abstract void digest();

}
