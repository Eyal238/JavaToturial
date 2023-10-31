//1.
public void f1(int rows,int columns)
{
        Random r=new Random();
        int[][] arr1=new int[rows][columns];
        int i,j;
        for(i=0;i<arr1.length;i++)
        {
            for(j=0;j<arr1[i].length;j++)
                arr1[i][j]=r.nextInt(101);
        }
        for(i=0;i<arr1.length;i++)
        {
            for(j=0;j<arr1[i].length;j++)
                System.out.print(arr1[i][j]+" ");
            System.out.println();
        }
}
