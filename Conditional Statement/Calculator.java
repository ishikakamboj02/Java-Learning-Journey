import java.util.*;
public class Calculator{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the 1st Number:");
        int a= sc.nextInt();
        System.out.print("Enter the 2nd Number:");
        int b= sc.nextInt();
        System.out.print("Enter the operator:");
        char operator= sc.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println("Sum is:"+ (a+b));
                break;
            case '-':
                System.out.println("Difference is:" + (a-b));
                break;
            case '*':
                System.out.println("Product is:"+ (a*b));
                break;
            case '/':
                System.out.println("Division is:" + (a/b));
                break;
            case '%':
                System.out.println("Remainder is:"+ (a%b));
                break;
            default:
                System.out.println("Enter valid operator");
                
        }



    }
}