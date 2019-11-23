package day11;

public class WarmUp1_LightOnOff {
    /*
    * Create class called WarmUp1_LightOnOff
    Create a variable  targetOption as String and assign one of below options  for example bd

    You have 4 switches in your home to turn on
          Bd — bedroom
          Lr  — living room
          ki  — kitchen
          Ha— Hallway

    Use switch statement to write a program to print which room light is turned on
    For example if Bd was targetOption
        then print  you have turned on bedroom light

* */
    public static void main(String[] args) {

        // there is a targetOption that store my option
        // and it looks like it has 2 character so i use String as data type
        String targetOption = "Ha";
        // what can be the data type of the variable inside switch
        // byte, short , int , char , String

        switch (targetOption) {
//            Bd — bedroom
//            Lr  — living room
//            Ki  — kitchen
//            Ha— Hallway
            case "Bd":
                System.out.println("you have turned on bedroom light ");
                break;
            case "Lr":
                System.out.println("you have turned on living room light");
                break;
            case "Ki":
                System.out.println("You have turned on kitchen light");
                break;
            case "Ha":
                System.out.println("You have turn on Hallway light");
                break;

            default:
                System.out.println("WRONG OPTION");
                break;

        }


    }

}
