import java.io.*;
class sample4{
  public static void main(String []args){
      int []element1={10,20,30,40,50};
      int []element2={100,200,300,400,500};
      int []element3=new int[5];
    for(int i=0; i<5; i++)
          {
       element3[i]=element1[i]+element2[i];
          } 	
    for (int i = 0; i < 5; i++) {
            System.out.println(element3[i]);
        }
}
}

