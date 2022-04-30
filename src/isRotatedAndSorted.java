public class isRotatedAndSorted {
    public static boolean Method(int arr[],int n)
    {
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]>arr[i])
            {
                count++;
            }
        }

        if(arr[n-1]>arr[0])
        {
            count++;
        }

        return count==1;
    }
    public static void main(String[] args)
    {
        int arr[]={4 ,5, 12, 7, 8, 9, 10, 1, 2, 3 };
        int n=arr.length;
        System.out.println(Method(arr,n));
    }
}
