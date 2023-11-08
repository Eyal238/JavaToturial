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
    if (num >0)
    {
        f2(num - 1);
        System.out.print(num+" ");
    }
}
public int f3(int x,int n)
{
    int ans;
    if(n>0)
       ans=x*f3(x,n-1);
    else
       ans=1;
    return ans;
}
