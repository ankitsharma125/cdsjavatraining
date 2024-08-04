//find the space complexity
import java.util.Scanner;
//reduce the space complexity
public class SpaceComplexity {
    public static void main(String[] args) {
                add();
    }

    private static void add() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt() + scanner.nextInt();
        System.out.println("The sum is: " + result);
    }
}
