import java.util.Scanner;
import java.util.HashSet;
public class test_q_2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            System.out.print("enter the number:");
            arr[i]=sc.nextInt();
        }
        System.out.print("[");
        for(i=0;i<n;i++)
        {
            if(i!=n-1)
            {
                System.out.printf("%d,",arr[i]);
            }
            else
            {
                System.out.printf("%d",arr[i]);
            }
        }
        System.out.println("]");
        boolean fo=false;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("true");
                    fo=true;
                    break;
                }
            }
            if(fo)
            {
                break;
            }
        }
        if(!fo)
        {
            System.out.println("false");
        }

        HashSet<Integer>rep=new HashSet<>();
        for(i=0;i<n;i++)
        {
            rep.add(arr[i]);
        }
        if(rep.size()<arr.length)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }

}
