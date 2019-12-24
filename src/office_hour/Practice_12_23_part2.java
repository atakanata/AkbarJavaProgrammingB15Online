package office_hour;

public class Practice_12_23_part2 {
    //return means give output

    public static void main(String[] args) {
        add(5, 10);//doesn't give you anything back

        int result2 = addWithReturn(5, 10);//gives something back
        System.out.println("Result 2: " + result2);
    }

    /**
     * void means - don't give anything back
     *
     * @param num1
     * @param num2
     */
    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    /**
     * int, it's a type of method output
     *
     * @param num1
     * @param num2
     * @return - sum of num1 and num2
     */
    public static int addWithReturn(int num1, int num2) {
        return num1 + num2;
    }
}
