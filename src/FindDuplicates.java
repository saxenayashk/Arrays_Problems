import java.net.Inet4Address;
import java.util.ArrayList;

public class FindDuplicates {
    public static void Method(int arr[],int n)
    {
        int count[]=new int[50];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for(int i=0;i<n;i++)
        {
            if(count[i]>1)
            {
                System.out.print(arr[i]+" ");
            }

        }
        System.out.println();
    }
    public static int EfficientMethod(int arr[],int n)
    {
        int res=0;
        for (int i = 0; i < n; i++) {
            res=res^arr[i];
        }

        for (int i = 1; i < n; i++) {
            res=res^i;
        }
        return res;
    }
    public static void main(String[] args)
    {
       int arr[]={3,1,2,4,2,6};
       Method(arr,arr.length);

       System.out.println(EfficientMethod(arr,arr.length));

        ArrayList<Integer> al=new ArrayList<>();

    }
}
