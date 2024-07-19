
class A implements Runnable{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("My child thread");
        }
    }
} 
public class ThreadImplement {
    public static void main(String[] args) {
        A t=new A();
        Thread r=new Thread(t);
        r.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("My Main thread");
        }
    }
}
