import java.util.*;
public class prog001
{
    public static void main(String[] args)
        {
        final int hoursinday = 24;
        final int minsinhour = 60;
        Scanner sc= new Scanner(System.in);
        int totmins, tothrs;
        int days=0,hours=0,mins=0;
        System.out.println("Enter total Minutes:");
        totmins=sc.nextInt();
        tothrs=totmins/minsinhour;
        mins=totmins%minsinhour;
        days=tothrs/hoursinday;
        hours= tothrs%hoursinday;
        System.out.println(totmins+"minutes is  "+days+"days  "+hours+"hours  "+mins+"minutes");
    }
}