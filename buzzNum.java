import java.util.*;
public class buzzNum {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter A Number :");
        int x=sc.nextInt();
        if((x%10==7)||(x%7==0)){
            System.out.println(x+" is a Buzz Number");
        }
        else{
            System.out.println(x+" is NOT a Buzz Number");
        }
    }
}
