import java.io.*;
import java.util.*;

class Switch3{
public static void main(String []args){

System.out.println("Enter number from 1 to 7 for days of the week");

Scanner s= new Scanner(System.in);

int number=s.nextInt();

switch(number){

case 1:
System.out.println("Sunday");
break;


case 2:
System.out.println("Monday");
break;


case 3:
System.out.println("Tuesday");
break;


case 4:
System.out.println("Wednesday");
break;


case 5:
System.out.println("Thursday");
break;


case 6:
System.out.println("Friday");
break;

case 7:
System.out.println("Saturday");
break;




}
}
}