import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
           A a = new A();
    }
}
class A{
    public A(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 =sc.nextInt();
        System.out.println("ente number 2");
        int num2 =sc.nextInt();
        System.out.println("enter choice \n 1 for addition \n 2 for subtraction \n 3 for multiply \n 4 for division");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
        }
    }
}
