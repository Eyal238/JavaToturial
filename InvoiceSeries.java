//  מחלקה לסדרה חשבונית
public class InvoiceSeries
{
    private int firstMember;
    private int difference;

    public InvoiceSeries(int fM,int diff)
    {
        firstMember=fM;
        difference=diff;
    }
    public void printGeneralSeries()
    {
        System.out.println("a(n)="+firstMember+"+"+"(n-1)"+"*"+difference);
    }
    public int calculateAn(int n)
    {
        int a;
        a=firstMember+((n-1)*difference);
        return a;
    }
    public double calculateN(int an)
    {
        double n;
        n=((double)(an-firstMember+difference)/difference);
        int n1=(int)n;
        if(n-n1==0)
           return n;
        else
           return 0;
    }
}
