package day52.warmup;

public class Account implements Transferable, Comparable<Account> {

    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // add logic to compare by balance
    @Override
    public int compareTo(Account otherAccount) {

        if (this.balance > otherAccount.balance) {
            return 1;
        } else if (this.balance < otherAccount.balance) {
            return -1;
        } else {
            return 0;
        }
        // return this.balance - otherAccount.balance
    }


    @Override
    public void transferAll(Account otherAccount) {

        // get the balance of current account
        // deposit to the other account
        otherAccount.balance += this.balance;
        // set current account balance to 0
        this.balance = 0;
//        // or optionally use the method
//        otherAccount.deposit( balance);
//        withdraw( balance );
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    // add a method called isPalindrome and return true if the name is palindrome
    // if a String is still same String after reversing it , it is regarded as Palindrome
    public boolean isPalindrome() {

        // first store it into temp and replace all the space and make it lowercase
        // WE DO NOT WANT TO ACTUALLY CHANGE THE NAME OF THE ACCOUNT  SO WE JUST WORK WITH IT'S COPY
        String nameCopy = this.name.toLowerCase().replace(" ", "");
        // we need to reverse the value then check whether they are still same String or not
        String reverseResult = "";
        for (int i = nameCopy.length() - 1; i >= 0; i--) {
            reverseResult += nameCopy.charAt(i);
        }

        return nameCopy.equals(reverseResult);
    }


}
/*
 * Warm up Task
 *
 * Create a class called Account
 * it has 2 fields
 *     name as String (protected) , balance as int (private)
 *
 *   -- add constructor to set name and balance
 *   -- add getters to the balance field
 *   -- add deposit method that accept 1 int arugument
 *          -- it will change the balance
 *   -- add withdraw method that accept 1 int arugument
 *          -- reduce the balance
 *   -- add toString method for nice output
 *  Create an interface called Transferable
 *  it has single abstract method
 *      - transferAll accept another Account object as parameter
 *      - void transferAll(Account otherAccount)
 *
 *  Account implements Transferable interface
 *      logic inside transferAll implementation
 *          it should take all the balance from current account to other Account
 *
 *   Create a class called   Account Action with main method
 *      Test your code by creating few Account objects
 *
 *
 *
 *   Optionally : let Account implements Comparable<Account>
 *          Create List<Account> and sort them using Collecions.sort(..)
 *
 *   to honor Palindrome day ,
 *   add a method inside Account class called
 *          isPalindrome return true if account name is palidrome (case and space should not matter)
 *
 */