package OopsConcept;
import java.util.*;
public class ClassObject {
    public static void main(String[] args) {
        //create  a object of class trainer
        Trainer teacher =new Trainer();
        System.out.println("enter teacher name ");
        Scanner sc = new Scanner(System.in);
        teacher.trainerName=sc.nextLine();
        System.out.println("enter teacher technology ");
        teacher.technology=sc.nextLine();
        System.out.println("teaher name: " + teacher.trainerName + "technology: " + teacher.technology);
        // create a object of students class 
        Students student=new Students();
        System.out.println("enter student name ");
        student.studentName=sc.nextLine();
        System.out.println("enter student technology ");
        student.enrolledTechnology=sc.nextLine();
        System.out.println(student.studentName + student.enrolledTechnology);
    }
}
class Trainer{
    String trainerName;
    String technology;
}
class Students{
    String studentName;
    String enrolledTechnology;
}