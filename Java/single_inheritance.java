import java.util.Scanner;

public class single_inheritance {

    public static void main(String[] args) {
        showinfo obj = new showinfo();
        obj.get();
        obj.show();
    }
}

class getinfo {
    String name;
    int age;

    void get() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = sc.nextLine();

        System.out.println("Enter age: ");
        age = sc.nextInt();
    }
}

class showinfo extends getinfo {
    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}