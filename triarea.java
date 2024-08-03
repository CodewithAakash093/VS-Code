import java.util.*;
public class triarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double sp=(a+b+c)/2;
        double ta=sp*(sp-a)*(sp-b)*(sp-c);
        double area = Math.sqrt(ta);
        double h=area/28;
        System.out.println("Semiperimeter--"+sp);
        System.out.println("Area : "+area);
        System.out.println("Height of paralleogram : "+h);

    }
    
}
