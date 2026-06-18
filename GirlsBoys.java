import java.util.*;

class GirlsBoys{
public static void main(String []args){

Scanner s= new Scanner(System.in);

System.out.println("ratio of girls and ratio of boys and total number of students ");

float rofB=s.nextFloat();
float rofG=s.nextFloat();
float tnofS=s.nextFloat();

float noOfBoys =tnofS*rofB/(rofB+rofG);
float noOfGirls =tnofS*rofG/(rofB+rofG);

System.out.println("number of Boys="+noOfBoys);

System.out.println("number of Girls="+noOfGirls);
}
}


