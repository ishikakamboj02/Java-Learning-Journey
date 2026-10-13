import java.util.ArrayList; // to import ArrayList class
public class Array_List{
    public static void main (String args[]){
        ArrayList <Integer> list = new ArrayList<>();

        // add elemenys in list = list.add(element)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // print the ArrayList
        System.out.println(list);

        // get operation = list.get(index)
        int element = list.get(2);
        System.out.println("Element at index 2 is: "+ element);

        // delete an element = list.remove(index)
        list.remove(2);
        System.out.println(list);

        // set an element = list.set(index, value)
        list.set(2, 10);
        System.out.println(list);

        // contains- checks if list contains any element or not = list.contains(element)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        

    }
}