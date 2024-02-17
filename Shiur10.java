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
