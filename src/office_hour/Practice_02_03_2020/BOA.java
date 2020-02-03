package office_hour.Practice_02_03_2020;

public class BOA {

    public static void main(String[] args) {

        BA Mohammed = new BA("Mohammed", 156000);
        // Mohammed.getEmployeeInfo();

        BA Parvin = new BA("Parvin", 145000);

        Testers Sevim = new Testers("Sevim", "QA", 120000);
        Testers Gunel = new Testers("Gunel", "Manual Tester", 110000);
        Testers Serife = new Testers("Serife", "SDET", 115000);

        Testers[] testers = {Sevim, Gunel, Serife};
        BA[] BATeam = {Mohammed, Parvin};

        ScrumTeam[][] scrum = {testers, BATeam};

        for (ScrumTeam[] eachArray : scrum) {
            for (ScrumTeam eachMember : eachArray) {
                eachMember.getEmployeeInfo();
            }

        }


    }
}
