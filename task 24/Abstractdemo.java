import java.io.*;
abstract class shape
{

abstract void area();
}
 
class circle extends shape
{
 
void area()
{
int r=3;
double a=3.14*r*r;
System.out.println("Area of circle="+a);
}
}
class rectangle extends shape{
void area()
{
int l=12;
int b=13;
int a=l*b;

System.out.println("Area of Rectangle = " + a);
}
}

class Abstractdemo {
    public static void main(String[] args) {

        circle c = new circle();
        rectangle r = new rectangle();

        c.area();
        r.area();
    }
}
