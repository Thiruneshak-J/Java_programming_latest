import java.util.Scanner;

public class linear_bin_search_bubble_sort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            System.out.print("enter the number:");
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the element to find:");
        int key=sc.nextInt();
        int ch=0;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                ch=1;
                break;
            }
        }
        if(ch==0)
        {
            boolean fo=false;
            for(i=0;i<arr.length;i++)
            {
                if(arr[i]==key)
                {
                    System.out.printf("element in %d index in array(linear search).\n",i);
                    fo=true;
                    break;
                }
            }
            if(!fo)
            {
                System.out.println("element not found in array(linear search).");
            }
        }
        else
        {
            for(i=0;i<arr.length-1;i++)
            {
                boolean sw=false;
                for(j=0;j<arr.length-i-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                        sw=true;
                    }
                }
                if(!sw)
                {
                    break;
                }
            }
            int l=0,m=0,h=arr.length-1;
            boolean fo=false;
            while(l<=h)
            {
                m=(l+h)/2;
                if(arr[m]==key)
                {
                    System.out.printf("element in %d index in array.(binary serach)",m);
                    fo=true;
                    break;
                }
                else if(arr[m]<key)
                {
                    l=m+1;
                }
                else
                {
                    h=m-1;
                }
            }
            if(!fo)
            {
                System.out.println("element is not found.");
            }

        }
    }

}
