import java.util.Scanner;
public class Bagrut21
{
    Scanner input = new Scanner (System.in);
    public int[] filter(int[] arr,int num)
    {
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
                i--;
        }
        return arr;
    }
}
