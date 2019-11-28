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
        //                 0123456789012345
        //String movie =  "Lord Of The Ring" ;


        String wordLordOf = movie.substring(0, 7);
        System.out.println("wordLordOf = " + wordLordOf);

//        int startingPoint = movie.indexOf(" ") + 1;
//        int endingPoint = movie.length();
        // assume we already know the location of starting point of second word
        // and the ending of the sentence

        String secondWordTillLast = movie.substring(5, 16);
        System.out.println("second Word TillLast = " + secondWordTillLast);

        // If you want to start from somewhere and just get the rest of the String
        // above method will work , however there is even better method
        // if you provide only one parameter to substring method
        // it will just start from that location and get till the end
        String secondToLast = movie.substring(5);


        // with this in mind : TASK
        // YOU KNOW THE INDEX ALREADY
        //                 0123456789012345
        //String movie =  "Lord Of The Ring" ;
        // TURN-->> Lord Of The Ring -->> Ring Of The Lord
        String wordRing = movie.substring(12);
        String wordOfThe = movie.substring(4, 12);
        String wordLord = movie.substring(0, 4);

        System.out.println(wordRing + wordOfThe + wordLord);

        // TURN-->> Lord Of The Ring -->> Ring Of The Java Lord
        System.out.println(wordRing + wordOfThe + "Java " + wordLord);


//        System.out.println("second word till last :"
//                + movie.substring(startingPoint, endingPoint));


    }


}
