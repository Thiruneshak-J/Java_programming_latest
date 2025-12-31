import java.util.Scanner;
public class steel_grade
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int h,t;
        float c;
        while(true) {
            System.out.print("Hardness of the steel:");
            h = sc.nextInt();
            if (h > 999 || h < 1)
            {
                System.out.println("invalid enter between 1 to 999");
            }
            else
            {
                break;
            }
        }
        while(true)
        {
            System.out.print("Carbon content of the steel:");
            c = sc.nextFloat();
            if(c>1)
            {
                System.out.println("invalid number.enter decimal");
            }
            else
            {
                break;
            }
        }
        System.out.print("Tensile strength od steel :");
        t=sc.nextInt();
        System.out.print("------------------------------------------------\nCONDITIONS:\nHardness must be greater than 50\nCarbon content must be less than 0.7\nTensile strength must be greater than 5600\n---------------------------------------------------\n");
        if(h>50 && c<0.7 && t>5600)
        {
            System.out.println("steel grade 10");
        }
        else if(h>50 && c<0.7)
        {
            System.out.println("steel grade 9");
        }
        else if(c<0.7 && t>5600)
        {
            System.out.println("steel grade 8");
        }
        else if(h>50 && t>5600)
        {
           System.out.println("steel grade 7");
        }
        else if(h>50 || c<0.7 || t>5600)
        {
            System.out.println("steel grade 6");
        }
        else
        {
            System.out.println("Steel grade  5");
        }
    }
}
