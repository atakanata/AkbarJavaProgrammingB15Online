package day62;

import day61.Job;

import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {


        // Create a SortedSet of Job(from day 61) with TreeSet implementation
        // add 5 jobs and print them out vertically and see what you get
        SortedSet<Job> sortJob = new TreeSet<>();

        sortJob.add(new Job("FL", 120000, "AT&t"));
        sortJob.add(new Job("LA", 130000, "BBC"));
        sortJob.add(new Job("TX", 150000, "Apple"));
        sortJob.add(new Job("CA", 100000, "Amazon"));
        sortJob.add(new Job("VA", 110000, "USPTO"));

        for (Job each : sortJob) {
            System.out.println("each = " + each);
        }


    }

}
