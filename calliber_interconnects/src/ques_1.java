import java.util.Arrays;
import java.util.Scanner;
public class ques_1
{
    //closet distance
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float[] arr={11.53f,12.3f,14.43f,11.55f,12.31f,16.0f,13.45f,17.0f};
        Arrays.sort(arr);
        float[] ans_arr={arr[0],arr[1]};
        float diff=arr[1]-arr[0];
        int i;
        for(i=0;i<arr.length-1;i++)
        {
                float diff_1 = arr[i+1] - arr[i];
                if (diff_1 < diff) {
                    ans_arr[0] = arr[i];
                    ans_arr[1] = arr[i+1];
                    diff = diff_1;
                }
            }
        System.out.println("Answer:"+Arrays.toString(ans_arr));
    }
}
