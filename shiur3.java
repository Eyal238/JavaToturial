//4.
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

