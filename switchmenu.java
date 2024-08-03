import java.util.*;
public class switchmenu{
    public static void main(String[] args) {
        double i=0;
        int a;
        Scanner sc=new Scanner(System.in);

        System.out.println("Chose any of the following list below :--");
        System.out.println("1: Natural Logarithm of the Number");
        System.out.println("2: Absolute Value of the Number");
        System.out.println("3: Square Root of the Number");
        System.out.println("4: Cube Root of the Number");
        System.out.println("5: Random number between 1 and Zero");
        System.out.println("Enter your required choice form 1 to 5 :");
        a=sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("ENTER the number to be Calculated");
                i=sc.nextDouble();
                System.out.println("The Natural Logarith of "+i+" is : "+Math.log(i));
                break;

            case 2:
                System.out.println("ENTER the number to be Calculated");
                i=sc.nextDouble();
                System.out.println("The Absolute Value of "+i+" is : "+Math.abs(i));
                break;
            
            case 3:
                System.out.println("ENTER the number to be Calculated");
                i=sc.nextDouble();
                System.out.println("The Square Root of "+i+" is : "+Math.sqrt(i));
                break;

            case 4:
                System.out.println("ENTER the number to be Calculated");
                i=sc.nextDouble();
                System.out.println("The Cube Root of "+i+" is : "+Math.cbrt(i));
                break;  

            case 5:
                System.out.println("A RANDOM Number between 1 and 0 is : "+Math.random());
                break; 

            default:
                System.out.println("Valid Choices are 1 to 5-- ENTER A VALID CHOICE!!!");
                break;
        }
    }
}