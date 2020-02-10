package office_hour.Practice_02_10_2020;

class circle {

    public double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object O) {  // chekcs if two circules has same radius or not


        //   Object O1 = new circle(3.4);
        //   Object O2 = new String();
        if (O instanceof circle) {  // checks iof  is circles object or not

            if (radius == ((circle) O).radius) { // check if two circles have same radius or not
                return true;
            }
        }

        return false;
    }

    /*
    instanceof:
        syntax:
            referenceName   instanceof  className

     */


}


public class TestCircle {

    public static void main(String[] args) {

        circle c1 = new circle(3.5);
        circle c2 = new circle(4);
        Object c3 = new String();


        System.out.println(c1.equals(c2));  // true
        System.out.println(c2.equals(c3));

        //    new Object().equals()

        circle c4 = new circle(7);
        circle c5 = new circle(7);

        System.out.println(c4.equals(c5));  // false


    }


}
