// Convert Decimal number into Binary:
public class dectobin{
    public static void decTobin(int n){
        int pow= 0;
        int binNum= 0;
        int myNum= n;
        while(n>0){
            int rem= n%2;
            binNum= binNum+ (int)(rem* Math.pow(10, pow));

            pow++;
            n= n/2;
        }
        System.out.println("Binary Form of "+ myNum + "= "+ binNum);

    }
    public static void main(String[] args) {
        decTobin(7);
    }
}