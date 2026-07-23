import java.io.*;

class shopping
{
public void bill(int price)
{
System.out.println("price ="+price);
System.out.println();
}
public void bill(int price, int quantity)
{
System.out.println("total=" +price*quantity);
System.out.println();
}
public void bill(String item, int price)
{
System.out.println("items="+item);
System.out.println("price of  item="+price);
}
}
class methodovdemo{
public static void main(String []args)
{
shopping s=new shopping();

s.bill(800);
s.bill(432,4);
s.bill("pyjamas",1232);
}
}



