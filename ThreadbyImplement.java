class A implements Runnable {
    public void run() 
    {
        try{ for(int i=0;i<5;i++)
            {
                System.out.println("Arka");
                Thread.sleep(1000);
            }}
       catch(InterruptedException e)
       {
        System.out.println(e);
       }
    }
}
class B implements Runnable{
    public void run()
    {
        try{
            for(int i=0;i<5;i++)
        {
            System.out.println(" i love Ankita");
            Thread.sleep(1000);
        }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
public class ThreadbyImplement {
    public static void main(String[] args) {
        A r=new A();
        B s=new B();
        Thread t=new Thread(r);
        Thread z=new Thread(s);
        
        z.start();
        try{
            z.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        t.start();   
    }
}
