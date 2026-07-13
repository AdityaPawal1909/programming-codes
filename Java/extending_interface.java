public class extending_interface {
    public static void main(String[] args) {
        circle obj = new circle();
        obj.compute();
        obj.compute2();
    }
}
interface area
{
    void compute();
}
interface area2 extends area
{
    void compute2();
}
class circle implements area2
{
    public void compute()
    {
        System.out.println("This is the first method in area2 interface");
    }
    public void compute2()
    {
        System.out.println("This is the second method in area2 interface");
    }
}