abstract class Demo
{
    int x;
    void accept()
    {
        x=10;
    }
    abstract void display();
}
public class abstract_class extends Demo
{
    public void display()
    {
        System.out.println("Value of x: "+x);
    }
    public static void main(String[] args) {
        abstract_class obj = new abstract_class();
        obj.accept();
        obj.display();
    }
}