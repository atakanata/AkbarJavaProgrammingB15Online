package day42;

public class Movie {

    String name;
    double length;
    String type;

    public Movie() {
        System.out.println("EMPTY MOVIE");
    }

    // write a constructor to set all the fields value
    public Movie(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }

    // toString method so we can directly print out


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
