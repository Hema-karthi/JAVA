import java.util.*;

class BankAccount
{
    String accountHolder;
    double balance;

  
    static int totalAccounts = 0;

   
    BankAccount(String name, double bal)
    {
        accountHolder = name;
        balance = bal;
        totalAccounts++;

    }

    void display()
    {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
        System.out.println();
    }

    
    static void displayTotalAccounts()
    {
        System.out.println("Total Accounts = " + totalAccounts);
    }
}
class statictask 
{
    public static void main(String []args)
    {
        BankAccount b1 = new BankAccount("Hema", 5000);
        BankAccount b2 = new BankAccount("Karthik", 8000);
        BankAccount b3 = new BankAccount("Aadhya", 10000);

        b1.display();
        b2.display();
        b3.display();

        BankAccount.displayTotalAccounts();
    }
}