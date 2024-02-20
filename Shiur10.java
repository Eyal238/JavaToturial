// 1.
public void f1(int[] arr,int index)
{
     if((index>=0)&&(index<arr.length))
     {
         if (arr[index] % 2 != 0)
         {
             arr[index]=arr[index]+1;
         }
     }
     else
         System.out.println("Error!");
}
//8.
public int f8(int[] arr)
{
        int i,sumTotal=0,sumCurrent=0;
        for(i=0;i<arr.length;i++)
            sumTotal=sumTotal+arr[i];
        for(i=0;i<arr.length-1;i++)
        {
            if((arr[i]+sumCurrent)==(sumTotal-(arr[i]+arr[i+1])))
                return (i+1);
            else
            {
                sumTotal=sumTotal-arr[i];
                sumCurrent+=arr[i];
            }


        }
        return -1;
}
