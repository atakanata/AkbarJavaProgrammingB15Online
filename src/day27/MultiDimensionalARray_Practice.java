package day27;

public class MultiDimensionalARray_Practice {


    public static void main(String[] args) {
        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysitsTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalysitsTeam};

        int maxLength = scrumTeam[0][0].length();
        String longestString = "";   // to store the longest string

        for (String[] each1DArray : scrumTeam) {
            for (String eachElement : each1DArray) {
                if (maxLength < eachElement.length()) {  // to compare which string has the largest length
                    maxLength = eachElement.length();
                    //  to assign maximum string length

                    longestString = eachElement;
                    // if the string has the largest length, we assign that string to longestString
                }
            }

        }

        System.out.println(maxLength);
        System.out.println(longestString);


        for (String[] each1DArray : scrumTeam) {
            for (String eachElement : each1DArray) {

                if (maxLength == eachElement.length()) {
                    System.out.println(eachElement);
                }

            }

        }


    }
}
