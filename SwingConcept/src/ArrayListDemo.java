import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nameList = new ArrayList<>();
        nameList.add(1);
        nameList.add(2);
        nameList.add(3);
        nameList.add(4);
        nameList.add(2);
        nameList.add(7);
        nameList.add(8);
        nameList.add(8);
        nameList.add(3);
        //to print the list of array
        System.out.println("print array");
        for (int name : nameList) {
            System.out.println(name);
        }
        System.out.println("print array at index 4");
        //to print the element using index
        System.out.println(nameList.get(4));
        // to sort the arraylist
        Collections.sort(nameList);
        System.out.println("sorted array");
        System.out.println(nameList);
        // reverse the array
        System.out.println("reversed arrau");
        for(int i=nameList.size()-1;i>=0;i--){
            System.out.println(nameList.get(i));
        }
        System.out.println("duplicate element");
        //find the number of duplicate elements
        int count =0;
        for(int i=0; i<=nameList.size();i++){
            for(int j = i+1;i < nameList.size();i++){
                if(nameList.get(i)== nameList.get(j)){
                    System.out.println(nameList.get(j));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
