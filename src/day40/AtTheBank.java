package day40;

public class AtTheBank {

    public static void main(String[] args) {


        BankAccount b1 = new BankAccount();
        b1.setAllTheValue("Saving", "Hasan", 123456789, 10000);

        b1.showAccountBalance();

        b1.showAccountHolderAccountType();

        b1.deposit(3000);
        System.out.println("b1 = " + b1);

        b1.withdraw100$Cash();
        System.out.println("b1 = " + b1);

        b1.withdraw(12000);
        System.out.println("b1 = " + b1);

        b1.purchaseProduct(120, 3);
        System.out.println("b1 = " + b1);


    }

}
