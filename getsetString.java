import java.io.*;
import java.util.*;
class student{
private String name;

public String getName()
{
return this.name;
}
public void setName(String name)
{
this.name=name;
}
}

class getsetString{
public static void main(String []args)
{
student s1=new student();
 
Scanner s=new Scanner(System.in);
String name=s.nextLine();
System.out.print("Enter name :");

s1.setName(name);
 System.out.println(s1.getName());
}
}	