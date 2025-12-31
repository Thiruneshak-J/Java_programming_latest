package sample;

import java.util.Scanner;
public class print{
    public static void main(String[] args)
    {
        System.out.println("i am thiruneshak");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("enter the number:");
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.print("you entered array is [");
        for(i=0;i<arr.length;i++)
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
        System.out.print("]\n");
    }

}

