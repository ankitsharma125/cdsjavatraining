package Array;

public class FindLargestSmallestElement {
        public static void main(String[] args) {
    
         int array[] = new int[]{1,7,3,21,11,9};
         int smallest = array[0];
         int largetst = array[0];
       
         for (int i = 1; i < array.length; i++) {
          if (array[i] > largetst)
           largetst = array[i];
          else if (array[i] < smallest)
           smallest = array[i];
         }
       
         System.out.println("Largest Number is : " + largetst);
         System.out.println("Smallest Number is : " + smallest);
        }
    
}
