import java.io.*;

abstract class shoppingReview1
{

  public void kurtis()
  {
   
  }
  public void kids()
  {
  
  }
  }
class shoppingReview2 extends shoppingReview1
{
 public void kurtis()
  {
   System.out.println("want more collections ");

  }
 public void kids()
 {  
  System.out.println("have a good collection ");
 }
}

class polymorphism2	 {
public static void main(String []args){

shoppingReview1 s=new shoppingReview2();
  s.kurtis();
  s.kids();
}
}


