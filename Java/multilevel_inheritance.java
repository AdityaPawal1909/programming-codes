import java.util.*;

public class multilevel_inheritance {
    public static void main(String[] args) {
        div obj = new div();
        obj.met();
        obj.let();
        obj.set();
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
class Mul extends Sub{
    void let(){
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Mul: " + (a * b));
    }
}
class div extends Mul{
    void met(){
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Div: " + (a / b));
    }
}