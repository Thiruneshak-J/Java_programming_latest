import java.util.Arrays;
import java.util.Scanner;
public class prep_cts_2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of peoples:");
        int inp_1=sc.nextInt();
        System.out.print("enter the lift max capacity:");
        int inp_2=sc.nextInt();
        int[] arr=new int[inp_1];
        int i,j;
        for(i=0;i<inp_1;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<inp_1-1;i++)
        {
            boolean s=false;
            for(j=0;j<inp_1-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    s=true;
                }

            }
            if(!s)
            {
                break;
            }
        }
        int max=0;
        int co=0;
        for(i=0;i<inp_1;i++)
        {
            max += arr[i];
            if(max<=inp_2)
            {
                co+=1;
            }
            else
            {
                break;
            }
        }
        System.out.println("Arrays:"+ Arrays.toString(arr));
        System.out.println("count:"+co);
    }
}
