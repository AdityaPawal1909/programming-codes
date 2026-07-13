import java.util.*;

public class hierarchical_inheritance {
    public static void main(String[] args) {
        
        Sub obj1 = new Sub();
        Mul obj2 = new Mul();
        div obj = new div();
        obj1.set();
        obj2.let();
        obj.met();
        obj.get();
    }
}
class add{
    int a,b;
    Scanner sc = new Scanner(System.in);
    void get(){
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
    }
}
class Sub extends add{
    void set(){
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Sub: " + (a - b));
    }
}
class Mul extends add{
    void let(){
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Mul: " + (a * b));
    }
}
class div extends add{
    void met(){
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Div: " + (a / b));
    }
}