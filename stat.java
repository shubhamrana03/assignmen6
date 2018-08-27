import java.util.Scanner;
class star
{
    static int i;
    int j;
    static
    {
        i = 10;
        System.out.println("Static block called ");
    }
}

public class stat
{
    public static void main(String[] args)
    {
        System.out.println(star.i);
    }
}