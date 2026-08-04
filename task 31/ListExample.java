
//list datatype


import java.util.*;

class ListExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        
        names.add("Hema");
        names.add("Karthik");
        names.add("Archana");
        names.add("Gokulan");

       
        System.out.println(names);

       
        System.out.println("First name = " + names.get(0));

        
        names.set(1, "Rahul");

        
        names.remove("Archana");

        
        System.out.println(names);

        
        System.out.println("Size = " + names.size());

       
        for (String name : names) {
            System.out.println(name);
        }
    }
}