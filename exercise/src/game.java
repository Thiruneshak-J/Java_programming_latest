import java.util.Scanner;
import java.util.Random;
public class game
{
    public static void main(String[] args)
    {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int num=r.nextInt(10);
        System.out.println("total 3 times attempt");
        while(true)
        {
            int ch = 3;
            while (ch != 0)
            {
                    System.out.print("enter the number between (1 - 10):");
                    int ran = sc.nextInt();
                    if (ran > num)
                    {
                        if(ch==1)
                        {
                            System.out.println("it is greater.");
                            ch -= 1;
                            System.out.printf("there is remaining %d times%n", ch);
                        }
                        else
                        {
                            System.out.println("it is greater,try again.");
                            ch -= 1;
                            System.out.printf("there is remaining %d times%n", ch);
                        }
                    }
                    else if (ran < num)
                    {
                        if(ch==1)
                        {
                            System.out.println("is is lesser.");
                            ch -= 1;
                            System.out.printf("there is remaining %d times%n", ch);
                        }
                        else
                        {
                            System.out.println("is is lesser,try again");
                            ch -= 1;
                            System.out.printf("there is remaining %d times%n", ch);
                        }
                    }
                    else
                    {
                        System.out.print("correct number.");
                        ch=0;
                        break;
                    }
                }
            if (ch==0)
            {
                System.out.printf("the correct answer is %d%n", num);
                break;
            }
            }
        }
    }

