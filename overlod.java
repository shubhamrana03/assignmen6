import java.util.Scanner;
class over
{
 void print()
{
System.out.println("Null");

 }

void print(int a1)
{
System.out.println("integer="+a1);

 }

void print(float a2)
{
System.out.println("Float="+a2);

 }

}

public class overlod
{
 public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int x;
float y; 
x = in.nextInt();
y = in.nextFloat();
 over a = new over();
 over b = new over();
 over c = new over();
a.print();
b.print(x);
c.print(y);
}
}