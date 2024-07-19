import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="AppletAdd" height=300 width=500></applet>
public class AppletAdd extends Applet implements ActionListener{

    int v1,v2,sum=0;
    TextField t1=new TextField(8);
    TextField t2=new TextField(8);
    Label l1=new Label("Value 1");
    Label l2=new Label("Label 2");
    Button b1=new Button("Add");
   
    public void init()
    {
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g)
    {
        
        g.drawString("Sum="+sum,900,80);
    }
    public void actionPerformed(ActionEvent e)
    {
        v1=Integer.parseInt(t1.getText());
        v2=Integer.parseInt(t2.getText());
        sum=v1+v2;
        
            repaint();
        
    }
    
}
