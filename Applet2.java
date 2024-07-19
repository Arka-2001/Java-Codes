
import java.awt.*;
import java.applet.*;
//<applet code="Applet2" height=300 width=500></applet>
 public class Applet2 extends Applet  implements Runnable
 {
    public void run()
    {
        repaint ();
    }
    public void paint(Graphics g) {
        
        for (int i = 0; i < 4; i++) {
            g.setColor(Color.green);
            g.drawOval(20, i * 50, 30, 30);
            
            try{
                Thread.sleep(2000);}
                catch (Exception aa)
                {
                    
                }
        }
    }
    public static void main(String[] args) {
        Applet2 a=new Applet2();
        Thread t=new Thread(a);
        a.start();
    }
}
