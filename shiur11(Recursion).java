public void f1(int num)
{
    if(num>0)
    {
        System.out.print(num);
        f1(num - 1);
    }
}
