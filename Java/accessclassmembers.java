import java.util.*;

public class accessclassmembers {
    public static void main(String[] args) {
        Student s=new Student();
        s.get();
        s.show();
    }
}
class Student{
    String name;
    int age;
    Scanner sc = new Scanner(System.in);
    void get(){
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter age");
        age = sc.nextInt();
    }
    void show(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}
