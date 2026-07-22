
import java.io.*;

class shopping1
{
 public void grocery()              // virtual method
  {
   System.out.println(" listed item purchased");
  }
 public void vegetables()
  {
   System.out.println("items purchased");
  }
}

class shopping2 extends shopping1
{
public void vegetables()
 {
  System.out.println("some items missing");
 }
}

class virtual
{
 public static void main(String []args)
 {
  shopping1 m1=new shopping2();
  
  m1.grocery();
  m1.vegetables();
 }
}