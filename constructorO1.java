import java.io.*;
class shopping{

private String item;
private int price;

shopping()
{
 item ="kurti";
 price=1000;

}
shopping(String i, int p)
 {
     item = i;
     price = p;
 }

public void display(){
 
System.out.println("item : "+item);
System.out.println("price :"+price);
}
}


class constructorO1{
public static void main(String []args){
 
shopping s1=new shopping();
shopping s2=new shopping("kurti",1500);


s1.display();
s2.display();
}
}