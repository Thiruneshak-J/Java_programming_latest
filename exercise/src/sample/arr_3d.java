package sample;
import java.util.Scanner;
public class arr_3d
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of block:");
        int blo=sc.nextInt();
        System.out.print("enter the rows:");
        int row=sc.nextInt();
        System.out.print("enter the column:");
        int col=sc.nextInt();
        int[][][] cub=new int[blo][row][col];
        int i,j,k;
        for(i=0;i<blo;i++)
        {
            for(j=0;j<row;j++)
            {
                for(k=0;k<col;k++)
                {
                    System.out.print("enter the number:");
                    int num=sc.nextInt();
                    cub[i][j][k]=num;
                }
            }
        }
        System.out.println("you entered 3d array of cube is:");
        for(i=0;i<blo;i++)
        {
            for(j=0;j<row;j++)
            {
                for(k=0;k<col;k++)
                {
                    System.out.printf("%d ",cub[i][j][k]);
                }
                System.out.println();
            }
            System.out.print("----------------\n");
        }
    }
}
