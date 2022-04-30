public class FreqInSortedArray {
    public static void Method(int arr[],int n)
    {
        int freq=1;
        int i=1;

        while(i<n)
        {
            while (i<n && arr[i]==arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            i++;
            freq=1;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
         int arr[]={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
         int n=arr.length;

         Method(arr,n);
    }
}
