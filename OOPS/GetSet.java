public class GetSet{
    public static void main (String args[]){
    Student s1= new Student();
    s1.setname("Ishika");
    System.out.println(s1.getname());

    s1.setrollNo(112);
    System.out.println(s1.getrollNo());

    }
    

}

class Student{
    private String name;
    private int rollNo;

    String getname(){// getter funcn
        return this.name;
        
    }

    int getrollNo(){
        return this.rollNo;
    }

    void setname( String newname){// setter funcn
        this.name= newname;
    }

    void setrollNo( int newrollNo){
        this.rollNo= newrollNo;
    }

}