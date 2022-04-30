import java.util.ArrayList;
import java.util.Arrays;

public class AddTwoArrays {
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
    public static void Method(int arr[],int m,int brr[],int n)
    {
        int num1=0;
        int num2=0;

        for (int i = 0; i < m; i++) {
            num1=num1*10+arr[i];
        }

        for (int i = 0; i < n; i++) {
            num2=num2*10+brr[i];
        }

        int sum=num1+num2;



        ArrayList<Integer> res=new ArrayList<>();

        while (sum!=0)
        {
            int rem=sum%10;
            res.add(rem);
            sum=sum/10;
        }



        for (int i = res.size()-1; i>=0 ; i--) {
            System.out.print(res.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
       int arr[]={9,9,9};
       int brr[]={9,9,9};

       Method(arr,arr.length,brr,brr.length);
    }
}
