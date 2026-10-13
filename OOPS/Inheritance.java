public class Inheritance{
    public static void main (String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.swim();
        shark.breathe();

    }
}

class Animal{// Parent class
    String color;

    void eat(){
        System.out.println("Animal eats something");
    }

    void breathe(){
        System.out.println("All animals breathe");
    }
}

class Fish extends Animal{// Child class
    int fins;

    void swim(){
        System.out.println("Fishes can swim");
    }
}