import java.io.*;
import java.util.*;

class NamePass{
public static void main(String []args){

Scanner s=new Scanner(System.in);

System.out.println("enter username");
String UserName=s.nextLine();


System.out.println("enter your Password");
String Password=s.nextLine();
 
if(UserName.equals("Hemalatha")&& Password.equals("hema@950") ||Password.equals("hema@463"))
{
System.out.println("vallid User");
}
else
{
System.out.println("invalid user");
}
}
}


 