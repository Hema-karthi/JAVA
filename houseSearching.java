import java.io.*; 
import java.util.*;

class housing{
private String type;
private String facing;
private int floor;
private String amenities;
private int rent;

public void housedetails(){

Scanner s=new Scanner(System.in);
System.out.println("enter type");
type=s.nextLine();
System.out.println("facing");
facing=s.nextLine();
System.out.println("floor no.");
floor=s.nextInt();
s.nextLine();
System.out.println("amenities");
amenities =s.nextLine();
System.out.println("Rent");
rent=s.nextInt();
}
 

public void printdetails(){
System.out.println();
System.out.println("house type: "+type);
System.out.println("house facing: "+facing);
System.out.println("house floor no: "+floor);
System.out.println("house amenities: "+amenities);
System.out.println("house rent: "+rent);

System.out.println();
System.out.println("house image viewing 🏡");
}

}


class houseSearching{

public static void main(String []args){

housing rent1=new housing();
housing rent2=new housing();

rent1.housedetails();
rent1.printdetails();

rent2.housedetails();
rent2.printdetails();
}
}





