import java.util.ArrayList;
public class ReverseList{
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();

        // add elemenys in list = list.add(element)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // print the ArrayList
        System.out.println(list);
        System.out.print("List after Reversing: ");

        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");

        }
        System.out.println();
    
        
    }

}