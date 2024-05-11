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
//2.
public void f2()
{
        Scanner scan=new Scanner(System.in);
        int[][] arr2=new int[3][3];
        int i,j,maxLine=0;
        for(i=0;i<arr2.length;i++)
        {
            for(j=0;j<arr2[i].length;j++)
            {
                System.out.println("Enter number between 0-100:");
                arr2[i][j] = scan.nextInt();
            }
        }
        for(i=0;i<arr2.length;i++)
        {
            int sumLine=0;
            for(j=0;j<arr2[i].length;j++)
            {
                System.out.print(arr2[i][j]+" ");
                sumLine = sumLine + arr2[i][j];
            }
            System.out.println();
            if(sumLine>maxLine)
                maxLine=sumLine;
        }
        System.out.println(maxLine);
}
//3.
public void f3(int rows,int columns)
{
        Random r=new Random();
        int[][] arr1=new int[rows][columns];
        int[][] arr2=new int[rows][columns];
        int[][] arr3=new int[rows][columns];
        int i,j;
        for(i=0;i<arr1.length;i++)
        {
            for(j=0;j<arr1[i].length;j++)
            {
                arr1[i][j] = r.nextInt(101);
                arr2[i][j] = r.nextInt(101);
                arr3[i][j]= arr1[i][j]+arr2[i][j];
            }
        }
        for(i=0;i<arr1.length;i++)
        {
            for(j=0;j<arr1[i].length;j++)
                System.out.print(arr1[i][j]+" ");
            System.out.println();
        }
        System.out.println();
        for(i=0;i<arr2.length;i++)
        {
            for(j=0;j<arr2[i].length;j++)
                System.out.print(arr2[i][j]+" ");
            System.out.println();
        }
        System.out.println();
        for(i=0;i<arr3.length;i++)
        {
            for(j=0;j<arr3[i].length;j++)
                System.out.print(arr3[i][j]+" ");
            System.out.println();
        }
}
//  .כתוב פונקציה המקבלת מטריצה מטיפוס תווים ובנוסף מחרוזת, הפונקציה תחזיר תשובה בוליאנית האם המחרוזת נמצאת באחת משורות המטריצה
public boolean ifFound(char[][] arr, String name)
    {
        int i, j,k,index;
        int row=arr.length;
        int cols=arr[0].length;
        int len=name.length();
        if (len > cols)
            return false;
        for (i = 0; i < row; i++)
        {
            for(j=0;j<cols;j++)
            {
                index=0;
                for(k=j;k<(j+len);k++)
                {
                    if(k==cols)
                        break;
                    if(arr[i][k]==name.charAt(index))
                       index++;
                }
                if(index==len)
                    return true;
            }
        }
        return false;
    }
