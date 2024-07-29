
import java.util.Random;

public class GenerateOtp{
    public static void main(String[] args) {
        Random random = new Random();
        int myOTP = random.nextInt(10000);
        System.out.println("myotp is : " + myOTP);
    }
}