import java.io.*;

class polymorphism{
public void addition (int a, int b, int c)
{
System.out.println("int, int ,int " );
}

public void addition(int a, int b)
{
System.out.println("int, int");
}

public void addition(float a, float b)
{
System.out.println("float, float");
}

public void addition(int a,float b)
{
System.out.println("int , float");
}

public void addition(float a, int b)
{
System.out.println("float ,int") ;
}
}
class sample1
{

  public static void main(String []args)
  {

    maths m1=new maths();
    m1.addition(100,200,300);
    m1.addition(10,20);
    m1.addition(10.5f, 21.3f);
    m1.addition(100, 21.3f);
    m1.addition(12.5f, 200);



  }

}