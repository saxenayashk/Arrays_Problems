public class ZigZagTraversal {
    public static void Method(int arr[],int n)
    {
        boolean flag=true;
        int temp=0;

        for (int i = 0; i < n-1; i++) {

            if(flag)
            {
                if(arr[i]>arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }

            }
            else
            {
                if(arr[i+1]>arr[i])
                {
                    temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }

            }
            flag=!flag;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {4, 3, 7, 8, 6, 2, 1};
        Method(arr,arr.length);
        ReverseArrayInGroups.print(arr);
    }
}
