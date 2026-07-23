import java.io.*;
class bank{
public void intrest()
{
System.out.println("Bank and their interest");
System.out.println();
}
}
class SBI extends bank
{
public void intrest()
{
super.intrest();
System.out.println("SBI bank interest=9%");
System.out.println();
}
}
class ICICI extends SBI
{
public void intrest()
{
super.intrest();
System.out.println("ICICI Bank  interest=12%");
}
}

class virtualdemo{
public static void main(String []args)
{
bank s=new ICICI();
 s.intrest();
}
}


