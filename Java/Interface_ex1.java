public class Interface_ex1 {
    public static void main(String[] args) {
        circle obj = new circle();
        obj.compute();
    }
}
interface area
{
    final static double PI=3.14;
    void compute();
}
class circle implements area
{
    double r;
    public void compute()
    {
        r=5.0;
        System.out.println("Area of circle: "+PI*r*r);
    }
}