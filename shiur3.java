//3.
public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter player1:");
        String player1=scan.next();
        System.out.println("enter player2:");
        String player2=scan.next();
        System.out.println("enter x:");
        int x1=scan.nextInt();
        System.out.println("enter x2:");
        int x2=scan.nextInt();
        System.out.println("enter v1:");
        int v1=scan.nextInt();
        System.out.println("enter v2:");
        int v2=scan.nextInt();
        double t1=(x1/v1);
        double t2=(x2/v2);
        if(t1<=t2)
            System.out.println(player1);
        else
            System.out.println(player2);
    }
//8.
import java.util.Scanner;
public class A
{
    public static void main(String []args)
    {
        int unit;
        int complete,remainder;
        System.out.println("Enter your number:");
        Scanner scan = new Scanner(System.in);
        unit=scan.nextInt();
        if (unit > 0 && unit < 10)
            System.out.println(1.2 * unit);
        else
            if (unit == 10)
                System.out.println(10);
            else
                if(unit > 10 && unit < 54)
                {
                    complete=unit/10;
                    remainder=unit%10;
                    System.out.println((10*complete)+(1.2*remainder));
                }
                else
                    if(unit==54)
                        System.out.println(50);
                    else
                        if(unit>54&&unit<108)
                        {
                            complete=(unit-54)/10;
                            remainder=(unit-54)%10;
                            System.out.println(50+(complete*10)+(remainder*1.2));
                        }
                        else
                            if(unit==108)
                                System.out.println(100);
                            else
                                System.out.println("Error");
    }
}

