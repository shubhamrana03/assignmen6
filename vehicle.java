import java.util.Scanner;
abstract class vehicl
{
abstract void start();
 void stop()
{  
System.out.println("Engine is off");
}

}

class twowheeler extends vehicl
{
 void start()
{
System.out.println("Two wheeler is on");
}

}

class fourwheeler extends vehicl
{
 void start()
{
 System.out.println("Fourwheeler is on ");
}

}

 


public class vehicle
{
 public static void main(String[] args)
{
 twowheeler a = new twowheeler();
 fourwheeler b = new fourwheeler();
 a.start();
 a.stop();
  b.start();
 b.stop();
}
}

 