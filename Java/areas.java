import java.util.*;
public class areas {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.get();
        obj.set();
    }
}
class Area{
    Scanner sc = new Scanner(System.in);
    void get(){
        double r;
        System.out.println("Enter radius");
        r = sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println("Area of Circle: "+ area);
    }
    void set(){
        int l,b;
        System.out.println("Enter length and Breadth");
        l = sc.nextInt();
        b = sc.nextInt(); 
        double area = l*b;
        System.out.println("Area of Rectangle: "+ area);
    }
    
}
