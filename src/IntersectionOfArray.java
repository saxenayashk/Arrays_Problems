public class IntersectionOfArray {
    public static void Method(int a[],int m,int b[],int n)
    {
        int res[]=new int[m+n];

        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n)
        {
            if(a[i]<=b[j])
            {
                res[k]=a[i];
                k++;
                i++;
            }
            else
            {
                res[k]=b[j];
                k++;
                j++;
            }
        }

        while(i<m)
        {
            res[k]=a[i];
            k++;
            i++;
        }

        while(j<n)
        {
            res[k]=b[j];
            k++;
            j++;
        }

        for (int l = 0; l < k; l++) {
            System.out.print(res[l]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[]={1,3,5,7,9};
        int brr[]={2,4,6,8,10};

        Method(arr,arr.length,brr,brr.length);
    }
}
