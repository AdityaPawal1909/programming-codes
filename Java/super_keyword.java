public class super_keyword extends Dog {

    int age = 4;

    super_keyword() {
        super("pitbull", "Red");   // calling parent constructor
        System.out.println("Age of dog : " + age);
    }

    public static void main(String[] args) {
        super_keyword obj = new super_keyword();
        obj.show();
    }
}

class Dog {

    String name;
    String color;

    Dog(String n, String c) {
        name = n;
        color = c;
    }

    void show() {
        System.out.println("Dog name : " + name);
        System.out.println("Dog color : " + color);
    }
}