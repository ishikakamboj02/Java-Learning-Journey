// Keep entering numbers until user enters the multiple of 10:
import java.util.*;
public class breakex{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        do { 
            int n= sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println("The number is:" +n);

        } while (true);
        System.out.println("Oops, You entered a multiple of 10.");

        
    }
}