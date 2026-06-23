import java.io.*;
import java.util.*;
class Color{

public static void main(String []args)
{
System.out.println("Enter number ,color,country");

Scanner s=new Scanner(System.in);

int number=s.nextInt();
s.nextLine();
String color=s.nextLine();
String country=s.nextLine();

if(number==100 && color.equals("blue")&& country.equals("china"))
{
System.out.println("Welcome to China");
}
else if(number==200 && color.equals("black")&& country.equals("Dubai"))
{
System.out.println("Welcome to Dubai");
}
else if(number==300 && color.equals("red")&& country.equals("Switzerland"))
{
System.out.println("Welcome to Switzerland");
}
else{
System.out.println("Invalid");
}
}
}

