import java.io.*;
import java.util.*;

class NumberSeries1{
public static void main(String []args){
 
             
 //0,1,1,2,3,5,8
   int a=0;
   int b=1;
   int c;
   int count=1;
    System.out.print(a+" "+b+" ");
   while(count<=9){
        c=a+b;
      System.out.print(c+" ");
        a=b;
        b=c; 
        count++;  
                  }

}
}
