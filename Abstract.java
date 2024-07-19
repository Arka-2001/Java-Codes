abstract class Animal 
{
    Animal(){
        System.out.println("All animal........");
    }
}
class Dog extends Animal
{
    Dog()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Dog is barking");
    }
}
class Lion extends Animal
{
    Lion()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Lion is roaring");
    }
}
class Abstract
{
    public static void main(String[] args)
    {
        Dog r=new Dog();
        r.sound();
        Lion l=new Lion();
        l.sound();
    }
}