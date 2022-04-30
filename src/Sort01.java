public class Sort01 {
    public static void Method(int arr[],int n)
    {
        int curr=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=1)
            {
                int temp=arr[i];
                arr[i]=arr[curr];
                arr[curr]=temp;

                curr++;
            }
        }
    }

    public static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[]={1,0,0,1,1,0,1,0,0,0,1,1,0};
        int n=arr.length;

        Method(arr,n);
        print(arr);
    }
}
