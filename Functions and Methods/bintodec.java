public class bintodec{
    public static void bintodec(int binNum){
        int myNum= binNum;
        int pow=0;
        int decNum= 0;
        while(binNum>0){
            int lastdig= binNum%10;
            decNum= decNum+(lastdig *(int)Math.pow(2,pow));
            pow++;
            binNum= binNum%10;

        }
         System.out.println("Decimal of"+ myNum +"="+decNum);

    }
    public static void main(String args[]){
        bintodec(101);



    }
}