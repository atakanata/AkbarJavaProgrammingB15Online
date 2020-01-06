package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Akbar
 * Created At : 1/5/20
 */
public class ArrayListCreationShortWay {

    public static void main(String[] args) {

        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Cyborg");
        superHeroes.add("Flash");
        superHeroes.add("Aquaman");
        superHeroes.add("Wonder Woman");

        // Copying everything inside superHeroes list into superHeroCopy lst
        List<String> superHeroCopy = new ArrayList<>( superHeroes );
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

        // After Java 9  Arrays.asList(...) has been improved by List.of(...)
        // It's important to know Arrays.asList(...) because lots of company still using Java 8
        // and yes this is the simplest way to
        // create a type of unmodifiable(non-resizable) List Object (not ArrayList)
        List<String> oop = List.of("Abstraction","Encapsulation","Inheritance","Polymorphism") ;
        System.out.println("oop = " + oop);
        // and again if we want to save it into a regular ArrayList Object we can do :
        List<String> oopCopy = new ArrayList<>( oop ) ;
        // or in one shot
        List<String> oopLst = new ArrayList<>( List.of("Abstraction","Encapsulation","Inheritance","Polymorphism") ) ;
        System.out.println("oopLst in one short= " + oopLst);


    }

}
