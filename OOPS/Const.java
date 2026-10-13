public class Const{
    public static void main(String args[]){
        //Student s1= new Student("Ishika");// value passed at the time of object creation
        Student s1= new Student();
        System.out.println(s1.name);
    }

}

class Student{
    String name;
    int rollNo;

    // Student(String name){// constructor
    //     this.name= name;

    // }
    Student(){
        System.out.println("Constructor is called...");

    }
}