
import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args){
        System.out.println("enter your marks ");
        Scanner sc = new Scanner(System.in);
        int marks =sc.nextInt();
        switch(marks){
            case 10:
            System.out.println("fail");
        break;
            case 50:
            System.out.println("C grade");
        break;
            case 80:
            System.out.println("B grade");
        break;
            case 90:
            System.out.println("A grade");
        break;
            default:
            System.out.println("invalid");
        }

        
        }

    }
