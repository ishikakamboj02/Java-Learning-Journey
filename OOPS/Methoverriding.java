public class Methoverriding{
    public static void main (String args[]){
    Dog dodo = new Dog();
    dodo.sound();
    Animal A= new Animal();
    A.sound();


}
}

class Animal{
    String color;

    void sound(){
        System.out.println("Animals have sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
