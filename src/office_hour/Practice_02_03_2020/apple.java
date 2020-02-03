package office_hour.Practice_02_03_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class apple {


    public static void main(String[] args) {

        Testers Hasan = new Testers("Hasan", "Manual Tester", 85000);
/*
        System.out.println( Hasan.jobTitle ); // Manual Tester
        System.out.println(Hasan.employeeName); // Hasan
        System.out.println(Hasan.salary); // 85000

 */
        //     Hasan.getEmployeeInfo();
        Testers Alisa = new Testers("Alisa", "SDET", 120000);

        Testers Rauf = new Testers("Rauf", "QA", 100000);

        List<Testers> testersTeam = new ArrayList<>();
        testersTeam.addAll(Arrays.asList(Hasan, Alisa, Rauf));

            /*
           for( Testers   eachTester  :  testersTeam ) {
               eachTester.getEmployeeInfo();
               System.out.println("=============================================================");
           }
*/

        Developers Vladislav = new Developers("Vladislav", 130000);
        //   Vladislav.getEmployeeInfo();

        Developers Emel = new Developers("Emel", 130005);
        Developers Muge = new Developers("Muge", 130010);

        List<Developers> developersTeam = new ArrayList<>();
        developersTeam.addAll(Arrays.asList(Vladislav, Emel, Muge));

            /*
            for( Developers eachDevelopers   : developersTeam){
                eachDevelopers.fixingBugs();
            }
    */

        List<ScrumTeam> scrum = new ArrayList<>();
        scrum.addAll(testersTeam);  // parent class can referenc eto the child class' object
        scrum.addAll(developersTeam);

        for (ScrumTeam eachMember : scrum) {
            eachMember.getEmployeeInfo();
        }


    }
}
