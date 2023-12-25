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
public long f3(int x,int n)
{
    int ans;
    if(n>0)
       ans=x*f3(x,n-1);
    else
       ans=1;
    return ans;
}
// ניתן לכתוב את שאלה 3 באופן יותר אפקטיבי על ידי תזכורת של חוקי חזקות
public long f3Efec(int a,int n)
{
        long temp=0;
        if(n==0)
            return 1;
        else
            temp=f3Efec(a,n/2);
            if(n%2==0)
                return (temp*temp);
            else
                return (a*temp*temp);

}
//7.
public int lengthNum(int num)
{
    if(num==0)
         return 0;
    else
         return (1+lengthNum(num/10));
}
