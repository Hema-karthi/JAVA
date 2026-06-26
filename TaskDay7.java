import java.io.*;
 import java.util.*; 
class sample8{ 
public static void main(String [] args){
 Scanner sc=new Scanner (System.in);

 System.out.println("To check it is a palindrome or not");
 System.out.println("enter a number:");
 int num=sc.nextInt();
 int r,s=0; 
int temp=num; 
while(num>0) {
 r=num%10;
 s=s+r;
 if(num>9){
 s=s*10; 
}
 num=num/10;
 }
 System.out.println("the reversed of number is :" + s); 
if(s==temp)
{ System.out.println("it is a palindrome");
 } 
else{ System.out.println("it is not a palindrome"); }


 System.out.println("\n");
 System.out.println("reverse a number"); 
System.out.println("enter a number:");
 int number=sc.nextInt();
s=0;
 while(number>0)
 { 
r=number%10;
 s=s+r;
 if(number>9){
 s=s*10; 
} 
number=number/10;
 }
 System.out.println("the reversed of number is :" + s); 


System.out.println("\n");
 System.out.println("sum of the digit in the number"); 
System.out.println("enter a number:");
 int n=sc.nextInt();
s=0;
 while(n>0){ 
r=n%10;
 s=s+r;
 n=n/10; 
} 
System.out.println("sum of the digit:" + s); 


System.out.println("\n");
 System.out.println("to check it is a amstrong or not"); 
System.out.println("enter a number:"); 
int no=sc.nextInt();
 int t=no;
 while(no>0)
{ 
r=no%10;
 s=s+(r*r*r); 
no=no/10;
} 
if(s==t){
 System.out.println("it is a amstrong number");} 
else{ System.out.println("it is anot a amstrong number");}

 }}