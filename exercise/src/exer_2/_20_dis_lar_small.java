package exer_2;

import java.util.Scanner;

public class _20_dis_lar_small
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int lar=0,small=0;
        while (true)
        {
            System.out.print("enter the number:");
            int num= sc.nextInt();
            if(num>lar)
            {
                lar=num;
            }
            else if(num<lar)
            {
                small=num;
            }
            System.out.print("do you want to enter number:(press-1):");
            int ch=sc.nextInt();
            if(ch!=1)
            {
                break;
            }
        }
        System.out.printf("largest number which you entered is %d.\n",lar);
        System.out.printf("smallest number which you entered is %d.\n",small);
    }
}
