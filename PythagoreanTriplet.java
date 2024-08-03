import java.util.*;
public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the three sides of the Triange :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if ((a*a)+(b*b)==(c*c)) {
            System.out.println("Pyhagorean Triplet");            
        }
        else if((a*a)+(c*c)==(b*b)){
            System.out.println("Pyhagorean Triplet"); 
        }
        else if((b*b)+(c*c)==(a*a)){
            System.out.println("Pyhagorean Triplet"); 
        }
        else{
            System.out.println("NOT a Pythagorean Triplet");
        }
    }
}
