public int recMin(int[] arr,int i)
{
        if(i==arr.length-1)
            return arr[arr.length-1];
        int minInd=recMin(arr,i+1);
        if(arr[i]>arr[minInd])
            return minInd;
        else return i;
}
