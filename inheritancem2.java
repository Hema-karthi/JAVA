import java.io.*;

class sounds1
{
public String dog,cow,cat,lion;

public void animal1()
{
dog="bow bow";
System.out.println("Dog sounds like :"+dog);
}
}
class sounds2 extends sounds1{
public void animal2()
{
cow="moo moo";
System.out.println("cow sounds like:"+cow);
}
}
class sounds3 extends sounds2{
public void animal3()
{
cat="meow meow";
System.out.println("cat sounds like:"+cat);
}
}
class sounds4 extends sounds3{
public void animal4()
{
lion="roars";
System.out.println("lion sounds like:"+lion);
}
}

class inheritancem2{
public static void main(String []args)
{
sounds4 m1=new sounds4();

m1.animal1();
m1.animal2();
m1.animal3();
m1.animal4();
}
}




