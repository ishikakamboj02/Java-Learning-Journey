

class Student{
    String name;
    int rollNo;
    String password;

    // copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
    }
    Student(){

    }

}
public class CopyConst{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Ishika";
        s1.rollNo = 123;
        s1.password = "abc";

        Student s2 = new Student(s1);
        s2.password = "xyz";
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.password);
       

    }
}