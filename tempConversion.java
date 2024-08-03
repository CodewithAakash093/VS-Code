import java.util.*;
public class tempConversion{
    public static void main(String args[]){
        double tempC,tempF;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Choice'1' or '2' ");
        int choice=sc.nextInt();
        if (choice==1){
            tempC=37;
            tempF=(tempC*1.8F)+32;
            System.out.println("Temperature in Farenheit is "+tempF);
        }
        else if(choice ==2){
            tempF=98.4;
            tempC=(tempF-30)/1.8F;
            System.out.println("Temperature in Celcius is "+tempC);
        }
        else
        System.out.println("Emter 1 for C to F and 2 for F to C conversion");
    }
}