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
