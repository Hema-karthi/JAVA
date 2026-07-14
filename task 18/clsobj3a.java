import java.io.*;
class student	{
public String oddeven(int a){      //with parameter and with return type
  
  if(a%2 == 0)
        {
          return " is even ";
        }
   else
       {
        return "is odd number";   
       }
}
}

class clsobj3a{
public static void main(String []args){
  student s1=new student();
  
  
  String result=s1.oddeven(43);
 System.out.println("43"+result);
}
}
  
