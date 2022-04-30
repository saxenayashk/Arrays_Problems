public class MoveArrayByK_Places {
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
    public static void Method(int arr[],int n,int d)
    {
        Reverse(arr,0,d-1);
        Reverse(arr,d,n-1);
        Reverse(arr,0,n-1);
    }
    public static void print(int arr[],int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int d=3;

        Method(arr,n,d);
        print(arr,n);
    }
}
