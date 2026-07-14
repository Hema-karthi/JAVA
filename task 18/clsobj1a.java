import java.io.*;
class student{
public void oddeven(){        //no parameter no return
 int a=12;
  
   if(a%2 == 0)
        {
   System.out.println(a+" is even");
        }
   else
       {
   System.out.println(a+" is odd number");   
       }
}
} 
 
class clsobj1a{
public static void main (String []args){
   student s1= new student();
    s1.oddeven();
}
} 