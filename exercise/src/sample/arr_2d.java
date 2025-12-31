package sample;
import java.util.Scanner;
public class arr_2d
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr={
                {1,2,3},
                {2,3,5},
                {2,3,4}
        };
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length;j++)
            {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
