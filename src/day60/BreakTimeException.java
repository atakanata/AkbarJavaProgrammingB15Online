package day60;

public class BreakTimeException extends RuntimeException {

}


class Main {


    public static void main(String[] args) {


//        throw new BreakTimeException();
        try {
            throw new MyOwnCheckedExeption();
        } catch (MyOwnCheckedExeption e) {
            System.out.println("WOLA MY OWN THING CAUGHT!!!");
        }

    }


}
