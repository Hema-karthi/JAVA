import java.io.*;
import java.util.*;
class largest{
public static void main(String []args){
   int []num={100,200,300,420,210};

     for(int i=0;i<num.length;i++)
         {
         System.out.println(num[i]);
         }
     int largest=num[0];
    for(int i=0;i<num.length;i++)
        {
          if(num[i]>largest)
              {
              largest=num[i];
              }
        }
   System.out.println("Largest="+largest);
}
}

