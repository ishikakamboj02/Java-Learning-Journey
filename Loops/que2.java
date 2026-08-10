// Sum of numbers enter by user:
import java.util.*;
public class que2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the range:");
        int n= sc.nextInt();
        int i= 1;
        int sum= 0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum is:" + sum);
        
    }
}