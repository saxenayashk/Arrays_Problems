public class ReverseArrayInGroups {
    public static void Reverse(int arr[],int low,int high)
    {
        while (low<=high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low++;
            high--;
        }
    }

    public static void Method(int arr[],int n,int k)
    {
        if(k>n)
        {
            return;
        }

        for (int i = 0; i < n; i+=k) {
            Reverse(arr,i,i+k-1);
        }
        System.out.println();
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
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int k=3;

        Method(arr,n,k);
        print(arr);
    }
}
