package InClassAssignments.Arrays;

public class AntiClockWiseReverseSpiral {
    public static void main(String[] args) {
//        TODO: guys give pull request ....
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [][]arr=new int[N][N];
        for(int row=0;row<N;row++)
        {
            for(int col=0;col<N;col++)
            {
                arr[row][col]=sc.nextInt();
            }
        }
        int rowStart=0;
        int rowEnd=arr.length-1;
        int colStart=0;
        int colEnd=arr[0].length-1;
     while(rowStart<=rowEnd && colStart<=colEnd)
     {
        //left
        for(int i=rowStart;i<=rowEnd;i++)
        {
            System.out.print(arr[i][colStart]+" ");
        }
        colStart++;

        //BOTTOM
        for(int i=colStart;i<=colEnd;i++)
        {
            System.out.print(arr[rowEnd][i]+" ");
        }
        rowEnd--;

        //right
        for(int i=rowEnd;i>=rowStart;i--)
        {
            System.out.print(arr[i][colEnd]+" ");
        }
        colEnd--;

        //top
        for(int i=colEnd;i>=colStart;i--)
        {
            System.out.print(arr[rowStart][i]+" ");
        }
        rowStart++;
     }  
            
    }
}
