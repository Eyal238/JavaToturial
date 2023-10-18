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

