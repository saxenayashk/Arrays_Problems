public class Sort012 {
    public static void Method(int arr[],int n)
    {
        int low=0;
        int mid=0;
        int high=n-1;

        while (mid<=high)
        {
            if (arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;

                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else if(arr[mid]==2)
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;

                high--;
            }
        }
    }
    public static void print(int arr[])
    {
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,1,1,0,0,2,1,0};
        int n=arr.length;
        Method(arr,n);
        print(arr);

    }
}
