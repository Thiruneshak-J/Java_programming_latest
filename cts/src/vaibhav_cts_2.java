import java.util.Scanner;
public class vaibhav_cts_2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the number :");
        int n=sc.nextInt();
        int MOD=1000000007;
        int ans=0;
        if(n==1||n==0)
        {
            ans=1;
            System.out.println("Ans:"+ans);
        }
        int[] dp =new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=(dp[i-1]+7*dp[i-2]+n/4) % MOD;
        }
        System.out.println("Anser:"+dp[n]);
    }
}
