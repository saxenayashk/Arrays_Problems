public class PairSum {
    public static void Naive(int arr[],int n,int sum)
    {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if((arr[i]+arr[j])==sum)
                {
                    System.out.print(arr[i]+"   "+arr[j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int x=5;

        Naive(arr,n,x);
    }
}
