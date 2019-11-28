package day15;

public class SubStringPractice {

    public static void main(String[] args) {

        // getting the part of the String out of another String
        //
        //          0123456789012345
        String movie = "Lord Of The Ring";
        // Sub string will return part of another string
        // starting from beginning index  until right before ending index

        String wordOf = movie.substring(5, 7);
        System.out.println("wordOf = " + wordOf);
        // I want to get the word (Of) from this movie

        String wordThe = movie.substring(8, 11);
        System.out.println("wordThe = " + wordThe);

        // Get from the second word till last word
        //             0123456789012345
        //String movie =  "Lord Of The Ring" ;
        int startingPoint = movie.indexOf(" ") + 1;
        int endingPoint = movie.length();

        System.out.println("second word till last :"
                + movie.substring(startingPoint, endingPoint));


    }


}
