package day52.books;

import java.util.Arrays;
import java.util.List;

public class PolymorphicBookCounting {

    public static void main(String[] args) {

        // reference type is Book, actual object type is PaperBook
        Book b1 = new PaperBook("Java", "Akbar", 3);
        System.out.println("b1 Object Type : " + b1.getClass().getSimpleName());

        Book b2 = new PaperBook("Selenium", "Vasyl", 2);
        Book b3 = new AudioBook("Agile", "Guljannat", 1.8);
        Book b4 = new PaperBook("The Kite Runner", "Khaled Hosseini", 3);
        Book b5 = new PaperBook("Lord of the Rings", "J. R. R. Tolkien", 2000);
        Book b6 = new AudioBook("Game of Thrones", "George R. R. Martin", 95.5);

        List<Book> bookList = Arrays.asList(b1, b2, b3, b4, b5, b6);

        // counting how many paper book we have
        int pCount = 0;
        for (Book each : bookList) {
            //each.displayInfo();
            String className = each.getClass().getSimpleName();
            System.out.println(className);
            if (className.equals("PaperBook")) {
                ++pCount;
            }
        }
        System.out.println("Paper Book Count = " + pCount);
        // we want to get the class type name using the object
        // obj.getClass().getSimpleName()


    }

}
