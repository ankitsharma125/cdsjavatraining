package Array;
public class Arraydemo {
    public static void main(String[] args) {
        String[] names = {"ankit","aman","arniket","ashutosh","aarav"};
        // array length 
        System.out.println(names.length);
        // array at index 
        System.out.println(names[2]);
        //replace ashutosh by ashu
        names[3]="ashu";
        System.out.println(names[3]);
        //print all array length
        for(int i=0;i<=names.length;i++){
            System.out.println(names[i]);
        }
        //for each loop to print array elements
        for ( String string : names) {
            System.out.println(string);
        }
        //out of bound exception
        for(int i=0;i<=names.length;i++){
            System.out.println(i);
        }
    }
}
