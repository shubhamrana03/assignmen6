import java.util.Scanner;
abstract class Animal
{
    private String breed,colour;
    Animal(String breed,String colour)
    {
        this.breed = breed;
        this.colour = colour;
    }
    public String getBreed()
    {
        return breed;
    }
    public String getColour()
    {
        return colour;
    }
    public abstract void speak();
}
class Dog extends Animal
{
    Dog(String b, String c)
    {
        super(b,c);
    }

    public void speak()
    {
        System.out.println(" Dog breed = "+getBreed()+"  colour = "+getColour());
    }
}
class Cat extends Animal
{
    Cat(String b, String c)
    {
            super(b,c);
    }
    public void speak()
    {
        System.out.println(" Cat breed = "+getBreed()+"  colour = "+getColour());
    }
}
public class animaal
{
    public static void main(String args[])
    {
Scanner in = new Scanner(System.in);
String a,b,c1,d1;
System.out.println("Enter for cat");
a = in.next();
b = in.next();
System.out.println("Enter for dog");
c1 = in.next();
d1 = in.next();
        Cat c = new Cat(a,b);
        Dog d = new Dog(c1,d1);
        d.speak();
        c.speak();
    }
}
