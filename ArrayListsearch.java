import java.io.*;
import java.util.*;
class ArrayListsearch{
public static void main (String []args)
{
ArrayList <String> names=new ArrayList<>();

names.add("Hema");
names.add("karthik");
names.add("aadhya");
names.add("gokul");

Scanner s=new Scanner(System.in);

System.out.println("enter a name :");

String search=s.nextLine();

 
     if (names.contains(search))
        {
        System.out.println("name found");
        }
     else
        {
        System.out.println("name not found");
        }
   
}
}



