import java.util.*;
public class electricCharges {
    public static void main(String[] args) {
        double sc=400.00;
        double c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Units Consumed : ");
        int u=in.nextInt();

        if (u<=100) {
            c=(u*2)+400.00;
            System.out.println("Electricity Charges: "+c);            
        }
        
        else if (u>100&&u<=200) {
            c=(u*1.80)+400.00;
            System.out.println("Electricity Charges: "+c);
        } 
        else if (u>200) {
            c=(u*1.50)+400.00;
            System.out.println("Electricity Charges: "+c);
        } 
    }
}
