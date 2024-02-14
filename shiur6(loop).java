//1.

//2.
public void f2()
{
   int count=1;
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter word:");
   String str=scan.next();
   while (!(str.equals("enter")))
   {
      count++;
      System.out.println("Enter word:");
      str=scan.next();
   }
   System.out.println(count);
}
//2/ do..while
public static void f2()
{
       Scanner scan=new Scanner(System.in);
       int count=0;
       String str;
       do
       {
           System.out.println("Enter String:");
           str=scan.next();
           count++;
       }while(!(str.equals("enter")));
       System.out.println(count);
}
// 4. 
public void f4()
{
    boolean ans=false;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter word:");
    String str=scan.next();
    for(int i=0;i<(str.length()/2);i++)
    {
        if(str.charAt(i)==str.charAt(str.length()-(i+1)))
            ans=true;
        else
        {
            ans=false;
            break;
        }
    }
    System.out.println(ans);
}
// 6.
public void f6()
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                if(i*j<10)
                    System.out.print(i * j + "  ");
                else
                    System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
//8.
public boolean f8(int num)
{
     int a=1;
     int b=1;
     while(a<=num)
     {
         if((a==num)||(b==num))
             return true;
         a=a+b;
         b=a+b;
     }
     return false;
}
//14.  טרפז שווה שוקיים של כוכביות
public void f14(int height)
{
        int i,j;
        int base=(height*2)+1;
        int x1=(base/2)-1;
        int x2=(base/2)+1;
        for(i=0;i<height;i++)
        {
            for(j=0;j<base;j++)
            {
                if(j>=x1&&j<=x2)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            x1 = x1 - 1;
            x2 = x2 + 1;
            System.out.println();
        }
}
// 18. מעבר של מספר בבסיס עשרוני לבינארי
public String f18(int num)
{
        String totalBinary="";
        int lastDigit;
        while(num>0)
        {
            lastDigit=num%10;
            totalBinary=String.valueOf(lastDigit%2)+totalBinary;
            num=num/2;
        }
        return totalBinary;
}
