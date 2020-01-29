package day49;

public interface Chargeable {

    public default void charge() {
        System.out.println("DEFAULT charge, " +
                "You may wanna do on your own");
    }

}
