import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="AppletForm1.class" height=150 width=200></applet>
public class AppletForm1 extends Applet implements ActionListner 
{
    String name=" ",gender=" ";
    int age;
    TextField n=new TextField(10);
    CheckboxGroup g=new CheckboxGroup();
    Checkbox m=new Checkbox("Male",g,true);
    Checkbox f=new Checkbox("Female",g,false);
    Choice c=new Choice();
    Label l1=new Label("Enter name: ");
    Label l2=new Label("Select gender: ");
    Label l3=new Label("Age: ");
    Button b1=new Button("Submit");
    public void init()
    {
        add(l1);
        add(n);
        add(l2);
        add(m);
        add(f);
        add(l3);
        c.add("18");
        c.add("19");
        c.add("20");
        c.add("21");
        add(c);
        add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString("Name: "+name,20,100);
        g.drawString("Gender: " +gender,20,120);
        g.drawString("Age: "+ age,20,140);
    }
    public void actionPerformed(ActionEvent e)
{
    name=n.getText();
    gender=g.getSelectedCheckbox().getLabel();
    age=Integer.parseInt(c.getSelectedItem());
    repaint();
}
    
}
