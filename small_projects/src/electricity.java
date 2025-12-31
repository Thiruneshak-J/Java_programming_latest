import java.util.Scanner;
public class electricity
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the units consumed:");
        int units=sc.nextInt();
        if(0<units && units<=100)
        {
            System.out.print("amount is 0.(100 units free)");
        }
        else if(units>100 && units<=200)
        {
            int unit1=units-100;
            unit1*=1.5;
            System.out.printf("amount to pay %d",unit1+50);
        }
        else if(units>200 && units<=300)
        {
            int unit1=units-200;
            int unit2=units-100-unit1;
            unit1*=2.5;
            unit2*=1.5;
            int pay=unit1+unit2+50;
            System.out.printf("amount to pay %d",pay);
        }
        else
        {
            int unit1=units-300;
            unit1*=4;
            double pay=(100*1.5)+(100*2.5)+unit1+50;
            System.out.printf("amount to pay %.2f",pay);
        }
    }

}
