import java.io.*;

class NestedFor6 
{
 public static void main(String []args)
  {
  for(int i=1;i<=3;i++)
     {
       for(int k=1;k<=3-i;k++)           //      1 
          {                              //    1 2 
        System.out.print(" "+" ");       //  1 2 3
           }
        for(int j=1; j<=i;j++)
           {
          System.out.print(j+" ");
           }
     System.out.println();
      }
}
}