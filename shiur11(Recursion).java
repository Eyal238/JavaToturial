public void f1(int num)
{
    if(num>0)
    {
        System.out.print(num);
        f1(num - 1);
    }
}
public void f2(int num)
{
    if (num >= 1)
    {
        f2(num - 1);
        System.out.print(num+" ");
    }
}
