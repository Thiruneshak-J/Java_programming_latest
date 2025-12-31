import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to SBI Atm");
        int t_amo=50000;
        while(true){
            System.out.print("enter the password:");
            int pass = sc.nextInt();
            if (pass > 9999 || pass < 1000)
            {
                System.out.printf("invaild password. enter the correct password%n");
            }
            else
            {
                System.out.printf("password entered successfully%n");
                break;
            }
        }
        int ch;
        while(true) {
            System.out.println("1-withdrawn");
            System.out.println("2-Balance details");
            System.out.println("3-Deposit to account");
            System.out.println("4-exit");
            while (true) {
                System.out.print("enter the choice of function to do:");
                ch = sc.nextInt();
                if (ch > 4) {
                    System.out.print("enter the choice correctly");
                } else {
                    break;
                }
            }
            switch (ch) {
                case 1:
                    System.out.print("enter the amount to withdrawn:");
                    int w_d = sc.nextInt();
                    t_amo -= w_d;
                    int rec;
                    while (true) {
                        System.out.print("do you want receipt of balance:(1-yes)(2-no):");
                        rec = sc.nextInt();
                        if (rec > 2) {
                            System.out.println("sorry,enter correctly");
                        } else {
                            break;
                        }
                    }
                    if (rec == 1) {
                        System.out.println("collect your receipt!!!!");
                        System.out.printf("balance amount in your account is : %d%n", t_amo);
                        System.out.println("thank you");
                        break;
                    } else {
                        System.out.println("thank you");
                        break;
                    }
                case 2:
                    System.out.printf("your account balance is %d%n", t_amo);
                    while (true) {
                        System.out.print("do you want receipt of balance:(1-yes)(2-no):");
                        rec = sc.nextInt();
                        if (rec > 2) {
                            System.out.println("sorry,enter correctly");
                        } else {
                            break;
                        }
                    }
                    if (rec == 1) {
                        System.out.println("collect your receipt!!!!");
                        System.out.printf("your account balance is : %d%n", t_amo);
                        System.out.println("thank you");
                        break;
                    } else {
                        System.out.println("thank you");
                        break;
                    }
                case 3:
                    System.out.print("enter the amount to deposit:");
                    int a_d = sc.nextInt();
                    t_amo += a_d;
                    while (true) {
                        System.out.print("do you want receipt of balance:(1-yes)(2-no):");
                        rec = sc.nextInt();
                        if (rec > 2) {
                            System.out.println("sorry,enter correctly");
                        } else {
                            break;
                        }
                    }
                    if (rec == 1) {
                        System.out.println("collect your receipt!!!!");
                        System.out.printf("your account balance is : %d%n", t_amo);
                        System.out.println("thank you");
                        break;
                    } else {
                        System.out.println("thank you");
                        break;
                    }
                case 4:
                    System.out.println("thank you,exiting");
                    break;
            }
            int ch1;
            System.out.print("enter 0 to exit from all or to continue press any integer");
            ch1 = sc.nextInt();
            if (ch1 == 0) {
                break;
            }
        }
    }
}
