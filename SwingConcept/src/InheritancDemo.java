
public class InheritancDemo {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        p1.parentMethod();
        p1.grandparentMethod();
    }
}
class Parent extends GrandParent{
    void parentMethod(){
        System.out.println("parent method");
    }
}
class GrandParent{

    void grandparentMethod(){
        System.out.println("grant parent method");
    }
}
