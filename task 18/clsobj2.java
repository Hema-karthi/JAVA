import java.io.*;
class student{   //with parameter no return
public void addition(int a,int b){
    int c=a+b;
   System.out.println("result ="+c);
}
}
class clsobj2{
public static void main(String []args){
 student s1=new student();
 int a=100; int b=200;
 s1.addition(a,b);
}
}