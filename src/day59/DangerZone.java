package day59;

import java.io.IOException;

public class DangerZone {


    public static void main(String[] args) {//}throws IOException {


        try {
            playWithFire();
        } catch (IOException e) {
            System.out.println("GO HERE IF YOU GET BURNED!!!");
        }


    }

    // this is a method that declare ,it might throw a checked exception IOException
    // whoever calls it , handle the consequences themselves
    public static void playWithFire() throws IOException {

        System.out.println("some consequences might happen ");
        throw new IOException("NOW YOU ACTUALLY GET BURNED");

    }


}
