import java.util.*;

class PrimeNo{

public static void main(String[] args) {

System.out.println("Enter a number");

Scanner S=new Scanner(System.in);
int no=S.nextInt();
int d=2;

while((no%d)!=0){
   
     d++;
}
if(no==d){
 System.out.println(no+"It is a prime number");
}
else{
System.out.println(no+"It is not a prime number");
}



 }
 }
