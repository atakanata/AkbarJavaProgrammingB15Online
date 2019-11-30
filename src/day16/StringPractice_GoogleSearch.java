package day16;

import java.util.Scanner;

public class StringPractice_GoogleSearch {

    public static void main(String[] args) {

        /*
        *
        *
        Create a program to ask user to
        enter a String with any number of word
        Create a variable called searchKeyword to save user input
        Create another String variable called tabTitle
        assign tabTitle value to searchKeyword +  "- Google Search"
        Check if tabTitle start with your searchKeyword
        and end with - Google Search
        If so print the test has passed , if not print test has failed
        (Assume you don't know tab title is already correct
        in real world , we will capture it with automation)
        * */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the keyword to search ");
        String keywordToSearch = scan.nextLine(); // "Java" ;

        String tabTitle = keywordToSearch + " - Google Search";

        if (tabTitle.startsWith(keywordToSearch) && tabTitle.endsWith(" - Google Search")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }


    }

}
