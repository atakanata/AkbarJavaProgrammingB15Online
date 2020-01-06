package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : akbar
 * Created At : 1/5/20
 */
public class ArrayListCreationShortWay {

    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg");
        superHeros.add("Flash");
        superHeros.add("Aquaman");
        superHeros.add("Wonder Woman");

        List<String> superHeroCopy = new ArrayList<>( superHeros );
        System.out.println("superHeroCopy = \n\t" + superHeroCopy);

        // THIS WILL CREATE A UNMODIFIABLE LIST !! no adding or removing (like array again?? yee )
        List<String> topics = Arrays.asList("Java","Selenium","Database","API") ;
        System.out.println("topics = \n\t" + topics);

        //topics.add("JIRA"); //ERROR!!
        //topics.remove("Java"); //ERROR!!
        topics.set(0,"Awesome Java"); // OK!
        System.out.println("topics = \n\t" + topics);

        // HERE COPYING EVERYTHING inside topic to topicCopy
        // And it's just regular ArrayList , we can do anything with it !!!
        List<String> topicsCopy =  new ArrayList<>( topics ) ;
        topicsCopy.add("Interview Prep"); //GOOD!!
        System.out.println("topicsCopy after adding item = \n\t" + topicsCopy);



    }

}
