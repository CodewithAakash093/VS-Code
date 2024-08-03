import java.util.*;
public class medianTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3,med=0;
        System.out.println("Enter 3 integers below:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        med=median(n1,n2,n3);
        System.out.println("Median of three given integers is: "+med);
    }
    public static int median(int x,int y,int z) {
         if (x<y) {
            if(z<x){
                return x;
            }    
            else if (y<z) {
                return y;
            }
            else{
                return z;
        }
    }

        else{
            if(z<y){
                return y;
            }    
            else if (x<z) {
                return x;
            }
            else{
                return z;
            }
        }
    }
}
