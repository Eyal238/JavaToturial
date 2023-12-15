//  מיון בחירה - פונקציה לולאתית
public void selectionSort(int[] arr)
{
      int i,j,smallest,temp;
      for(i=0;i<arr.length-1;i++)
      {
           smallest=i;
           for(j=i+1;j<arr.length;j++)
           {
               if(arr[j]<arr[smallest])
                   smallest=j;
           }
           if(i!=smallest)
           {
               temp=arr[smallest];
               arr[smallest]=arr[i];
               arr[i]=temp;
           }
      }
}
  
