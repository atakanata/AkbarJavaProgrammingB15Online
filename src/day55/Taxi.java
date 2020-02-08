package day55;

// Taxi  Engine  -- Driver -- Passengers
public class Taxi {

    int plateNumber;
    Engine eng;

    public Taxi(int plateNumber, Engine eng) {
        this.plateNumber = plateNumber;
        this.eng = eng;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", eng=" + eng +
                '}';
    }
}


class Engine {

    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
