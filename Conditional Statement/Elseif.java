public class Elseif{
    public static void main(String args[]){
        int age= 32;
        if (age>=18){
            System.out.println("You are an Adult");
        }
        else if (age>=13 && age<18){
            System.out.println("You are a Teenager");
        }
        else{
            System.out.println("You are a Child");
        }
    }
}