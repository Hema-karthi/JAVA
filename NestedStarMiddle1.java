import java.io.*;
class NestedStarMiddle1{
public static void main(String []args){
   int space=3;
   for (int i=1;i<=5;i++){
    if(i==1)
      {
        System.out.println("\t\t*");
        } 
      else if(i==2)
      {
       System.out.println("\t*\t\t*");
      }
     else if(i==3)
      {
      System.out.println("*\t\t\t\t*");
      }
     else if(i==4)
      {
        System.out.println("\t*\t\t*");
       }
    else if(i==5)
       {
       System.out.println("\t\t*");
       }
  }


}}


