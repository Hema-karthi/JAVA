import java.io.*;

class NestedFor5 
{
 public static void main(String []args)
  {
  for(int i=1;i<=3;i++)
     {
       for(int k=1;k<=3-i;k++)           //      1 
          {                              //    2 2 
        System.out.print(" "+" ");       //   3 3 3
           }
        for(int j=1; j<=i;j++)
           {
          System.out.print(i+" ");
           }
     System.out.println();
      }
}
}