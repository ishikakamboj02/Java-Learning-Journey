import java.util.*;
public class sum{
    public static void calculateSum(int num1, int num2){
        int sum= num1+num2;
        System.out.println("Sum is:"+ sum);


    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a= sc.nextInt();
        System.out.print("Enter 2nd number:");

        int b= sc.nextInt();
        calculateSum(a,b);
    }
    
}