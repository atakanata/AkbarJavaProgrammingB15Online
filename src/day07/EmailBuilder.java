package day07;

public class EmailBuilder {

    public static void main(String[] args) {

        String firstName, lastName, company, email;
        firstName = "Astrit";
        lastName = "Enver";
        company = "Verizon";
        // firstName_lastName@company.com    Astrit_Enver@Verizon.com
        email = firstName + "_" + lastName + "@" + company + ".com";

        System.out.println(" My name is " + firstName + " " + lastName + " and I work for " + company + " "
                + "and my email is " + email);

    }

}
