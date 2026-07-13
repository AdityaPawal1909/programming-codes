public class multiple_inh_using_interface {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
interface A
{
    void methodA();
}
interface B
{
    void methodB();
}
class C implements A, B
{
    public void methodA()
    {
        System.out.println("This is method A from interface A");
    }
    public void methodB()
    {
        System.out.println("This is method B from interface B");
    }
}