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
  
}
