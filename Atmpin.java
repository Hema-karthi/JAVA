import java.io.*;
import java.util.*;

class Atmpin{
public static void main (String []args){

Scanner s =new Scanner(System.in);

int correctPin=2507;
int pin;
int attempts=0;

   while(attempts<4){
    System.out.println("Enter a ATM pin number:");
     pin=s.nextInt();
    
         if(pin==correctPin){
             System.out.println("login successful");
             return;
                            }
         else{
             System.out.println("Entered wrong pin");
             }
            attempts++;
                   }
     System.out.println("Account blocked");
     }
    }