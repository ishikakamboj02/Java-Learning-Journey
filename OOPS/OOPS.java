public class OOPS{
    public static void main(String args[]){
        Pen p1= new Pen();// pen object
        p1.setColor("Pink");
        System.out.println(p1.color);

        p1.setCost(10);
        System.out.println(p1.cost);
    }

}
class Pen{
    String color;
    int cost;

    void setColor(String newColor){
        color= newColor;
    }

    void setCost(int newCost){
        cost= newCost;
    }
}

