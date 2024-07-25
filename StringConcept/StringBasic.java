package StringConcept;

import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        String name ="ankit sharma";
        //print string
        System.out.println(name);
        //string formatting to upper case 
        System.out.println(name.toUpperCase());
        //string formatting to lower case
        System.out.println(name.toLowerCase());
        System.out.println("enter your name");
        //check name input by person is same as string given
        Scanner sc=new Scanner(System.in);
        String sname =sc.nextLine();
        if("ankit sharma" == sname){
            System.out.println("allowed" );
        } else{
            System.out.println("not allowed ");
        }
        //not allowed because string can not be directly compared 
    }
}
