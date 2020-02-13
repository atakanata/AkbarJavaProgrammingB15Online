package office_hour.Practice_02_13_2020;

public class TestCustomClass {


    public static void main(String[] args) throws NoBreakTimeException {

        boolean studentAskForBreak = true;

        if (studentAskForBreak) {
            //  throw new NoBreakTimeException();  // unchecked
        } else {
            System.out.println("Continue");
        }


    }

    public static void method1() throws NoBreakTimeException {

    }


}
