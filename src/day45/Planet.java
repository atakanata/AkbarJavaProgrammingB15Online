package day45;

public class Planet {

    double gravity;
    int radius;
    boolean hasLife;

    public Planet() {

    }

    public Planet(double gravity, int radius, boolean hasLife) {
        this.gravity = gravity;
        this.radius = radius;
        this.hasLife = hasLife;
        System.out.println("CRAZY CHANGE");
    }

}
