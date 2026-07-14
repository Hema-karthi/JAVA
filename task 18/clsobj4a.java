import java.io.*;     //no parameter with return type,
class student{
public String oddeven(){
   int a=56;
 
 if(a%2 == 0)
   {
  return "is a even";
   }
 else
   {
  return "is a odd";
   }
}
}
 
class clsobj4a{
public static void main (String []args){
 student s1=new student();
  int a=56;
 
 String result= s1.oddeven();
 System.out.println(a+result);
}
} 