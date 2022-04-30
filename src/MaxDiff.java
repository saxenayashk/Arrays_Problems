public class MaxDiff {

    public static int Naive(int arr[],int n)
    {
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }

    public static int Efficient(int arr[],int n)
    {
        int res=arr[1]-arr[0];
        int minVal=arr[0];
        for (int i = 1; i < n; i++) {
            res=Math.max(res,arr[i]-minVal);
            minVal=Math.min(arr[i],minVal);
        }
        return res;
    }

    public static void main(String[] args)
    {
        int arr[]={10,20,30};
        System.out.println(Naive(arr,arr.length));
        System.out.println(Efficient(arr,arr.length));
    }
}
