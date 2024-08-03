import java.util.*;
public class DivisiblityTest{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        boolean divby2=false,divby4=false,divby5=false;
        int number, lastdigit, last2digits;
        System.out.println("Enter an intiger :");
        number = sc.nextInt();
        lastdigit = number%10;
        last2digits=number%100;

        if(lastdigit==0||lastdigit==2||lastdigit==4||lastdigit==6||lastdigit==8)
        divby2=true;

        if(lastdigit==0||lastdigit==5)
        divby5=true;

        if(last2digits%4==0)
        divby4=true;

        if(divby2==true&&divby4==true&&divby5==true)
        System.out.println(number+"is divisible by all 2,4 and 5");
        else
        System.out.println(number+"is NOT divisible by all 2,4 and 5");
    }
}