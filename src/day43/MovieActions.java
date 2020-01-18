package day43;


// this class has a lot of static methods to deal with movie object
// this class does not serve as template for creating object
// just like arrays class does not serve as template for creating array object

import day42.Movie;

public class MovieActions {


    public static void main(String[] args) {

        // data type mismatch
//        int x = "Joker";      // x is a container can store number
//        Scanner scan = "Joker";  // scan is a container can store address of any scanner object
//        Movie m2 = "Joker" ; // m2 is a container can store address of any movie object
        Movie m1 = new Movie("Joker", 2.5, "Drama");
        Movie m2 = new Movie("Cinderella", 1.5, "Family");

        printMovieInformation(m1);
        printMovieInformation(m2);

        printShorterDurationMovieName(m1, m2);

        //Integer i1 = Integer.valueOf(12);
        Movie result = getJokerMovieObject();
        System.out.println("Name is " + result.getName());

    }

    // create a static method that return  movie object with name Joker 2.5 hour and type Drama
    public static Movie getJokerMovieObject() {

        Movie j = new Movie("Joker", 2.5, "Drama");
        return j;

    }


    /**
     * A void method that accept 2 movie objects
     * and print the name of movie with shorter movie length
     * for example Frozen is 1.5 hours , Joker is 2.2 hours
     * so print The shorter movie is : Frozen
     *
     * @param movieObj1 first movie object
     * @param movieObj2 second movie object
     */
    public static void printShorterDurationMovieName(Movie movieObj1, Movie movieObj2) {
        //TODO YOUR CODE HERE
        if (movieObj1.getLength() < movieObj2.getLength()) {
            System.out.println(movieObj1.getName());
        } else {
            System.out.println(movieObj2.getName());
        }

    }


    /**
     * A void method that accept any movie object
     * and print out it's information in below format
     * The movie <name> is <length> hour long and it genre is <type>
     *
     * @param movieObj the movie object to get information from
     */
    public static void printMovieInformation(Movie movieObj) {
        //TODO YOUR CODE HERE
        System.out.print("The movie name " + movieObj.getName());
        System.out.print(" is " + movieObj.getLength() + "  hour long  ");
        System.out.println(" and it genre is " + movieObj.getType());
    }


}
