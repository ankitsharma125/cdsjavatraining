
import java.util.Scanner;

public class SwitchCaseExample2 {
    public static void main(String[] args) {
        System.out.println("Enter a day");
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        switch (day){
            case "monday":
            System.out.println("Monday workout ");
        break;
            case "tuesday":
            System.out.println("Tuesday workout");
        break;
            case "wednesday":
            System.out.println("Wednesday workout ");
        break;
            case "thursday":
            System.out.println("Thursday workout");
        break;
            case "friday":
            System.out.println("Friday workout ");
        break;
            case "saturday":
            System.out.println("Saturday workout");
        break;
            case "sunday":
            System.out.println("Sunday workout");
        break;
            default:
            System.out.println("invalid day");
        }

    }
}
