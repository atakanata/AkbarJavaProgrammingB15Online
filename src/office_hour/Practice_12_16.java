package office_hour;

public class Practice_12_16 {
    public static void main(String[] args) {
        String[] names = {"John", "Kevin", "Scott"};
        System.out.println("First name: " + names[0]);

        for (String name : names) {
            System.out.println(name);
        }
        //apache poi library  (read/write data from excel with java)
        //if you need age of 3rd student students[2][2]
        //if you need age of 1st student students[0][2]
        //if you need age of 2nd student students[1][2]
        //let's say we need to store some table
        //where we have rows and columns
//         |student id| name | age | Country |
//         | 1        | John | 35  | USA     |
//         | 2        | Kevin| 40  | Brazil  |
//         | 3        | Scott| 20  | Canada  |
        String[][] students = {
                {"1", "John", "35", "USA"},
                {"2", "Kevin", "40", "Brazil"},
                {"3", "Scott", "20", "Canada"}
        };
        //to format your code
        //click option + command + L
        System.out.println("How many arrays inside students 2d array? " + students.length);
        System.out.println("How many values in second row (inner array)? " + students[1].length);

        //loop through inner arrays
        for (String[] arr : students) {
            //loop through values in every inner array
            for (String value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        //Find oldest student and print his name
//        for(int i =0; i<students.length;i++){
//            int age = Integer.parseInt(students[i][2]);
//        }
        // 1st Get only age values
        //Integer.parseInt - convert string into int
        String oldestPersonName = students[0][1]; //let's infer that 1st person is oldest
        int ageOfOldestPerson = Integer.parseInt(students[0][2]);//let's infer that 1st person is oldest

        for (String[] row : students) {
            //go through every row and get
            //value only from 3rd column | number -1 = index
            System.out.println(row[2]);//3rd row represents age
            //I need to convert into integer to be able to compare
            int age = Integer.parseInt(row[2]);//convert string --> into int

            System.out.println("Age: " + age);

            //if age is higher than previous max
            if (age > ageOfOldestPerson) {
                //then we have new max age and new oldest name
                ageOfOldestPerson = Integer.parseInt(row[2]);
                oldestPersonName = row[1];
            }

        }

        System.out.println("Oldest person is: " + oldestPersonName);
    }
}
