package TimeComplexityProgram;

import java.util.*;
public class AreaRectangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int length=sc.nextInt();
        System.out.println("enter width");
        int width = sc.nextInt();
        System.out.println(areaRectangle(length, width));
    }
    private static int areaRectangle(int length,int width){
        return length*width;
    }
}
