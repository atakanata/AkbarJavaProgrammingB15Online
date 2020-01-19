package day44;

public class HouseBuilder {


    public static void main(String[] args) {


        CyberHouse.showNeighbourhoodName();

        CyberHouse c1 = new CyberHouse("Vintage", 101);
        c1.showAllInfo();
        CyberHouse c2 = new CyberHouse("Classic", 102);
        c2.showAllInfo();

        //System.out.println(CyberHouse.neighbourhoodName );


        // How do I get max value of Short
        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);

    }

}
