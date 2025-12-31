import java.util.Arrays;
import java.util.Scanner;
//sorting bubble and merge sort
public class ques_4
{
    public static void bubble_sort(int[] arr)
    {
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            boolean fo=false;
            for(j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    fo=true;
                }
            }
            if(!fo)
            {
                break;
            }
        }
        System.out.println("bubble_sort:"+ Arrays.toString(arr));
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={23,43,2,31,20,34,45,55,1};
        bubble_sort(arr);
    }

}
