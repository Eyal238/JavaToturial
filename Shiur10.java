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
//2.
public void f2()
{
        int[] arr=new int[5];
        int sum=0;
        double avg;
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter grade:");
            int grade=scan.nextInt();
            sum+=grade;
        }
        avg=(double)(sum/5);
        System.out.println(avg);
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
//9. כתוב פונקציה המקבלת מערך מחרוזות ותו כלשהו, הפונקציה תחזיר כמה פעמים התו נמצא במערך
public int f9(String[] arr,char letter)
{
        int count=0;
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length();j++)
            {
                if(arr[i].charAt(j)==letter)
                    count++;
            }
        }
        return count;
}
