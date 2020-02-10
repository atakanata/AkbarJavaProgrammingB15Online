package office_hour.Practice_02_10_2020;

class rectangle {
    public double l, w;

    public rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public boolean equals(Object O) {

        if (O instanceof rectangle) {
            double Area1 = l * w;
            double Area2 = ((rectangle) O).l * ((rectangle) O).w;
            if (Area1 == Area2) {
                return true;
            }
        }

        return false;
    }


}


public class TestRectangle {

    public static void main(String[] args) {
        rectangle r1 = new rectangle(3, 4);  // 12
        rectangle r2 = new rectangle(5, 3); // 15

        System.out.println(r1.equals(r2));

    }


}
