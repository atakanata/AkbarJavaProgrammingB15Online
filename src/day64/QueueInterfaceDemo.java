package day64;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {

    public static void main(String[] args) {

        // THIS IS A FIRST-IN-FIRST-OUT QUEUE  (FIFO)
        // whichever items comes in first , it will get removed first
        // when we use remove method from the Queue interface

        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("review the class");
        taskQueue.add("do your homework");
        taskQueue.add("attend the class");
        taskQueue.add("Say bye to Java");

        System.out.println("taskQueue = " + taskQueue);

        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue = " + taskQueue);


    }


}
