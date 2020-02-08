package day55.association;

// Taxi  Engine  -- Driver -- Passengers

// Taxi has Driver -- Driver object has 2 attribute (name ,driverID)

// Create a class called Driver -- it has has 2 attribute (name String ,driverID int)
// constructor to set the value , add toString method so we can print out
// Add a instance field called Driver dr , update your constructor to set Driver as well

public class Taxi {

    int plateNumber;
    // just like String , we have class Engine
    // so I can use it as data type for my field
    Engine eng;
    // just like String , we have class Driver
    // so I can use it as data type for my field
    Driver dr;

    public Taxi(int plateNumber, Engine eng, Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "Plate Number=" + plateNumber +
                ", Engine =" + eng.toString() +
                ", Driver =" + dr.toString() +
                '}';
    }
}










