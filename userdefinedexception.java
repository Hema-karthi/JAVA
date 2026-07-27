import java.io.*;
import java.util.*;

class BankException extends Exception
{
public BankException(String message)
{
super(message);
}
}

class userdefinedexception
{
public static void main(String []args)
{
 int balance=12000;

 System.out.println("enter withdraw amount=");
 Scanner s= new Scanner(System.in);
 int withdraw=s.nextInt();

 try
  {
   if(withdraw>balance)
    {
     throw new BankException("Insufficient balance check balance ");
    }
   else
    {
     balance=balance-withdraw;
     System.out.println("Available balance="+balance);
    }
   }
catch(BankException ex)
  {
   System.out.println(ex.getMessage());
  }
}
}
 