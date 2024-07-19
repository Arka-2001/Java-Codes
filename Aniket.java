import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//<applet code="Aniket" height=600 width=600></applet>
public class Aniket extends Applet implements ActionListener
{
Button door, window, roof;
    Color c = Color.green;
    Color d = Color.green;
    Color f = Color.green;
    Color e = Color.white;
    public void init()
    {
        door = new Button("Door");
        window = new Button("Window");
        roof = new Button("Roof");
        add(door);
        add(window);
        add(roof);
        door.addActionListener(this);
        window.addActionListener(this);
        roof.addActionListener(this);
   
    }
public void actionPerformed(ActionEvent evt)
    {
        String cmd = evt.getActionCommand();
        if (cmd.equals("Door")) 
            d = Color.blue;
        else if (cmd.equals("Window"))
             f = Color.red;
        else if (cmd.equals("Roof")) 
            e = Color.yellow;
   
        repaint();
    }


public void paint (Graphics g)
{
int x[] = {100, 200, 230, 70};
int y[] = {100, 100, 150, 150};
int nop = 4;
g.setColor(e);
g.fillPolygon(x, y, nop);
g.setColor(c);
g.fillRect(80, 150, 140, 80);
g.setColor(f);
g.fillRect(100, 170, 24, 16);
g.fillRect(176, 170, 24, 16);
g.setColor(d);
g.fillRect(135, 170, 30, 60);
g.setColor(Color.orange);
g.fillOval(400,40,50,50);

}
}