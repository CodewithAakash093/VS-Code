import java.util.*;
public class largestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three intiger Numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();

        if (a>b){
            if(a>c)
            System.out.println("The largest Number is :" +a);
            else{
                System.out.println("The largest Number is :" +c);
            }
        }

        else {
            if(b>c)
            System.out.println("The largest Number is : "+b);
            else{
                System.out.println("The largest Number is : "+c);   
            }
        }
        
    }
}
