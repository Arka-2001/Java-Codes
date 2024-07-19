class Box
{
    double width;
    double depth;
    double height;
    Box(double w,double d,double h)
    {
        System.out.println("CONSTRUCTNG Box : ");
        width=w;
        depth=d;
        height=h;
    }
    public double volume()
    {
        return width*height*depth;
    }
}
 class BOXDemo1 {
    public  static void main(String[] args)
    {
        Box obj1=new Box(10,20,15);
        Box obj2=new Box(10,10,10);
        double a=obj1.volume();
        double b=obj2.volume();
        System.out.println("The volume of Box1 is" + " "+ a);
        System.out.println("The volume of Box2 is" + " " + b);
    }
}