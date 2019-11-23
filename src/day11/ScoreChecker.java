package day11;

public class ScoreChecker {

    public static void main(String[] args) {

        int score = 70;

        if (score < 0 || score > 100) {
            System.out.println("INVALID SCORE!!!!");

        } else if (score == 100) {

            System.out.println("Perfect Score!!");

        } else if (score >= 70 && score < 100) {

            System.out.println("PASSING SCORE!! ");

        } else {
            System.out.println("YOU HAVE FAILED THIS EXAM!");
        }


    }


}
// SCORE = 10000
//    score>70 || score <100

/*
* Create a program to check the score   : ScoreChecker with main method

   Create a variable called score assign a value of your choice

	 if the score is less than 0 or more than 100  —>> INVALID SCORE!!!!
      If the score is  100 —>> PERFECT SOCRE
      If the score is between 70-100  —>> YOU HAVE PASSED !
      Else you have failed !!!!!


	OPTIONAL :  add more condition for failing scores
    If the score is less than 20  —>. Come to my office
    If the score is between 30-40  —>. Attend additional classes
    If the score is between 40-70  —>. Little bit more study will let you pass
* */
