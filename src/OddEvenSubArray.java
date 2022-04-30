import java.util.*;

public class OddEvenSubArray {

    public static int Method(int arr[],int n)
    {
        int count=1;
        int res=1;
        for (int i = 1; i < n; i++) {
            if((arr[i]%2==0 && arr[i-1]%2!=0)||(arr[i]%2!=0 && arr[i-1]%2==0))
            {
                count++;
            }
            else
            {
                res=Math.max(res,count);
                count=0;
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int arr[]={12,23,34,45,53,67};
        int n=arr.length;

        System.out.println(Method(arr,n));
    }
}
