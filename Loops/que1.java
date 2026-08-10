// Print numbers 1 to 10:
import java.util.*;
public class que1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter the range:");
        int range= sc.nextInt();
        int counter= 1;
        while(counter <= range){
            System.out.println(counter);
            counter++;
        }
        System.out.println();
        
    }
}