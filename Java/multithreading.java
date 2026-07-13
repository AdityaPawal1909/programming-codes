 public class multithreading {
    public static void main(String[] args) 
    {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
    }
}

class Thread1 extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Aditya");
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Pawal");
        }
    }
} 
    

