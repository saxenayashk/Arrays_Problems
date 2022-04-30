import java.util.*;

public class MaxSubArraySum {

    public static int Method(int arr[],int n)
    {
        int curr=0;
        int res=0;
        for (int i = 0; i < n; i++) {
            curr+=arr[i];
            res=Math.max(curr,res);
        }
        return res;
    }

    public static void main(String[] args)
    {
       int arr[]={-1,4,6,-7,3,-2};
       int n=arr.length;
       System.out.println(Method(arr,n));
    }
}
