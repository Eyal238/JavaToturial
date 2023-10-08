//  מחלקה לסדרה חשבונית
public class ArithmeticProgression
{
    private int firstMember;
    private int difference;

    public ArithmeticProgression(int fM,int diff)
    {
        firstMember=fM;
        difference=diff;
    }
    public ArithmeticProgression(ArithmeticProgression other)
    {
        firstMember= other.firstMember;
        difference=other.difference;
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
    public boolean equal(ArithmeticProgression other)
    {
        if ((firstMember == other.firstMember) && (difference == other.difference))
            return true;
        else
            return false;
    }
    public boolean smallDff(ArithmeticProgression other)
    {
        if(other.difference<difference)
            return true;
        else
            return false;
    }
}

        
