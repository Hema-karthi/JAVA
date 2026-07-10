import java.io.*;
import java.util.*;
class  BubbleSorting{
     public static void main(String []args){
 
         int []number={12,34,13,23,21};
 
         System.out.println("Before sorting=");

    for(int i=0; i<number.length; i++)
         {
         System.out.print(number[i]+" ");
         }
    for(int i=0; i<number.length-1;i++)
         { 
            for(int j=0;j<number.length-1;j++) //j<number.length-1-i
              {
               if(number[j]>number[j+1])
                {
                 int temp=number[j];
                 number[j]=number[j+1];
                 number[j+1]= temp;
                }
              }
       
          }
       System.out.println();
       System.out.println("After sorting=");
   
   for(int i=0;i<number.length;i++)
       {
       System.out.print(number[i]+" ");
       }
}
}
