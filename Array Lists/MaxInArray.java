import java.util.ArrayList;
public class MaxInArray{
    public static void main (String args[]){
        ArrayList <Integer> array = new ArrayList<>();
        array.add(10);
        array.add(50);
        array.add(60);
        array.add(40);
        array.add(30);
        System.out.println(array);

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.size(); i++){
            if(max < array.get(i)){
                max = array.get(i);
            }
        }
        System.out.println("Maximum number is: "+ max);


    }
}