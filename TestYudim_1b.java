import java.util.Scanner;
import java.util.Random;
public class Test1b
{
    Scanner scan=new Scanner(System.in);
    Random r=new Random();
    public void f1()
    {
        double total;
        System.out.println("Enter price 1:");
        double price1=scan.nextDouble();
        System.out.println("Enter price 1:");
        double price2=scan.nextDouble();
        if(price1>=price2)
            total=(price2/2)+price1;
        else
            total=(price1/2)+price2;
        System.out.println(total);
    }
  public void f2()
  {
        System.out.println("Enter name1:");
        String name1=scan.next();
        System.out.println("Enter name2:");
        String name2=scan.next();
        int num1= r.nextInt(10);
        int num2=r.nextInt(10);
        if(((num1>=num2)&&(name1.compareTo(name2)<0))||((num2>num1)&&(name2.compareTo(name1)<0)))
            System.out.println(name1);
        else
            System.out.println("Nobody");
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
  }
}
