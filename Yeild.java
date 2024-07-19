class A extends Thread {
    public void run() 
    {
         for(int i=0;i<5;i++)
            {
                System.out.println("Arka");
                Thread.yield();
            }
    }
}
class B extends Thread{
    public void run()
    {
        
            for(int i=0;i<5;i++)
        {
            System.out.println(" i love Ankita");
            
        }
    }
}
public class Yeild {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        b.start();
        a.start();
        
    }
    
}
