// write a program to find the elligibility to vote
import java.util.*;
class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        String eligible= (age>=18)? "eligible" : "not eligible";
        System.out.println(eligible);
    }
}