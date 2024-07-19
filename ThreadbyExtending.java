class A extends Thread {
    public void run()
    {
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println("Arka");
                Thread.sleep(1000);
            }
        }
        catch(Exception r)
        {
            System.out.println(r);
        }
        
    }
}
class B extends Thread{
    public void run()
    {
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println("Sabuj");
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        }
    }

public class ThreadbyExtending  {
    public static void main(String[] args)  {
        A t=new A();
        B s=new B();
        s.start();
        t.start();        
    }
    
}
