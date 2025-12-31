import java.util.Scanner;
public class ex_11_grade
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name:");
        String name=sc.nextLine();
        while(true) {
            System.out.print("enter the class:");
            int cls = sc.nextInt();
            if (cls == 10) {
                int tam,eng,mat,sci,ss;
                while(true)
                {
                    System.out.print("enter the tamil mark");
                    tam = sc.nextInt();
                    if (tam > 100 || tam < 0)
                    {
                        System.out.println("invaild,enter correctly");

                    }
                    else
                    {
                        break;
                    }
                }
                while(true) {
                    System.out.print("enter the english mark");
                    eng = sc.nextInt();
                    if(eng>100 || eng<0)
                    {
                        System.out.println("invaild enter correctly:");
                    }
                    else
                    {
                        break;
                    }
                }
                while(true) {
                    System.out.print("enter the maths mark");
                    mat = sc.nextInt();
                    if(mat>100 || mat<0)
                    {
                        System.out.println("invaild enter correctly:");
                    }
                    else
                    {
                        break;
                    }
                }
                while(true) {
                    System.out.print("enter the Science mark");
                    sci = sc.nextInt();
                    if(sci>100 || sci<0)
                    {
                        System.out.println("invaild enter correctly:");
                    }
                    else
                    {
                        break;
                    }
                }
                while(true) {
                    System.out.print("enter the social mark");
                    ss = sc.nextInt();
                    if(ss>100 || ss<0)
                    {
                        System.out.println("invaild enter correctly:");
                    }
                    else
                    {
                        break;
                    }
                }
                int avg = (eng + tam + mat + sci + ss) / 5;
                System.out.printf("average of marks is %d%n", avg);
                if (avg > 90)
                {
                    System.out.print("Grade A");
                    break;
                }
                else if (avg > 80 && avg <= 90)
                {
                    System.out.print("grade B");
                    break;
                }
                else if (avg > 70 && avg <= 80)
                {
                    System.out.print("grade C");
                    break;
                }
                else if (avg > 60 && avg <= 70)
                {
                    System.out.print("grade D");
                    break;
                }
                else if (avg > 50 && avg <= 60)
                {
                    System.out.print("grade E");
                    break;
                }
                else
                {
                    System.out.print("fail");
                    break;
                }
            }
            else if (cls == 12)
            {
                int tam,eng,mat,phy,che,cs;
                    while(true)
                    {
                        System.out.print("enter the tamil mark");
                        tam = sc.nextInt();
                        if (tam > 100 || tam < 0)
                        {
                            System.out.println("invaild,enter correctly");

                        }
                        else
                        {
                            break;
                        }
                    }
                while(true) {
                    System.out.print("enter the english mark");
                    eng = sc.nextInt();
                    if(eng>100 || eng<0)
                    {
                        System.out.println("invaild enter correctly:");
                    }
                    else
                    {
                        break;
                    }
                }
                while(true) {
                    System.out.print("enter the maths mark");
                    mat = sc.nextInt();
                    if(mat>100 || mat<0)
                    {
                        System.out.println("invaild enter correctly:");
                    }
                    else
                    {
                        break;
                    }
                }
                while(true) {
                    System.out.print("enter the physics mark");
                    phy = sc.nextInt();
                    if(phy>100 || phy<0)
                    {
                        System.out.println("invaild enter correctly:");
                    }
                    else
                    {
                        break;
                    }
                }
                while(true) {
                    System.out.print("enter the chemistry mark");
                    che = sc.nextInt();
                    if(che>100 || che<0)
                    {
                        System.out.println("invaild enter correctly:");
                    }
                    else
                    {
                        break;
                    }
                }
                while(true) {
                    System.out.print("enter the computer science/biology mark:");
                    cs = sc.nextInt();
                    if(cs>100 || cs<0)
                    {
                        System.out.println("invaild enter correctly:");
                    }
                    else
                    {
                        break;
                    }
                }
                int avg = (eng + tam + mat + phy + che + cs) / 6;
                System.out.printf("average of marks is %d%n", avg);
                if (avg >= 100 || avg > 90)
                {
                    System.out.print("Grade A");
                    break;
                }
                else if (avg > 80 && avg <= 90)
                {
                    System.out.print("grade B");
                    break;
                }
                else if (avg > 70 && avg <= 80)
                {
                    System.out.print("grade C");
                    break;
                }
                else if (avg > 60 && avg <= 70)
                {
                    System.out.print("grade D");
                    break;
                }
                else if (avg > 50 && avg <= 60)
                {
                    System.out.print("grade E");
                    break;
                }
                else
                {
                    System.out.print("fail");
                    break;
                }
            }
            else
            {
                System.out.print("invaild detail\n");
            }
        }
    }
}
