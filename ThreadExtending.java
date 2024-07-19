
class B extends Thread{
    public void run()
    {
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println("ARKA");
               Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {

        }
    }
}
public class ThreadExtending {
    public static void main(String[] args)throws InterruptedException {
        B t=new B();
        t.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("SUBHA");
            Thread.sleep(1000);
        }
    }
}
