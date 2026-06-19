import java.io.*;

import java.util.*;

class movies
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the movie name");
        String moviename=s.nextLine();
        System.out.println("Enter the star name");
        String starname=s.nextLine();

        if(moviename.equals("karuppu") && starname.equals("surya") || moviename.equals("lkg") && starname.equals("rjbalaji"))
        {
            System.out.println("matched");
        }
        else
        {
            System.out.println("Not matched");
        }
    }
}