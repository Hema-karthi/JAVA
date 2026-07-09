import java.io.*;
import java.util.*;
class avg
{
   public static void main(String []args)
    {
      int []number={10,20,30,40,50};
      int sum=0;  
      int avg=0;
      for(int i=0;i<5;i++)
       {
        System.out.println(number[i]); 
       }
      for(int i=0;i<5;i++)
      {
       sum= sum+number[i];
      }
      System.out.println("sum ="+sum);
      avg=sum/number.length;
      System.out.println("average of these number="+avg);

}
}