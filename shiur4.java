// 1.   
import java.util.Scanner;
public class A
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter 3 numbers:");
        String num1=scan.next();
        String num2=scan.next();
        String num3=scan.next();
        if((num1.compareTo(num2)<0)&&(num2.compareTo(num3)<0))
            System.out.println(num1+","+num2+","+num3);
        else
            if((num1.compareTo(num3)<0)&&(num3.compareTo(num2)<0))
                System.out.println(num1+","+num3+","+num2);
            else
                if((num2.compareTo(num1)<0)&&(num1.compareTo(num3)<0))
                    System.out.println(num2+","+num1+","+num3);
                else
                    if((num2.compareTo(num3)<0)&&(num3.compareTo(num1)<0))
                        System.out.println(num2+","+num3+","+num1);
                    else
                        if((num3.compareTo(num1)<0)&&(num1.compareTo(num2)<0))
                            System.out.println(num3+","+num1+","+num2);
                        else
                            if((num3.compareTo(num2)<0)&&(num2.compareTo(num1)<0))
                                System.out.println(num3+","+num2+","+num1);
    }
}
//2.
import java.util.Scanner;
public class YudAlef
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=scan.nextLine();
        System.out.println(str.length()-3);
    }
}
