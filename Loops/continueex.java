// Print 1 to 10 Numbers skiping 5:
public class continueex{
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
        
    }
}