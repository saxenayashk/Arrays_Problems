import java.util.*;

public class LeadersInArray {
    public static void print(int arr[],int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Naive(int arr[],int n)
    {
        for (int i = 0; i < n; i++) {
            int j;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]>=arr[i])
                {
                    break;
                }
            }
            if(j==n)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public static void Efficient(int arr[],int n)
    {
        int max_from_right=arr[n-1];
        System.out.print(max_from_right+" ");

        for(int i=n-2;i>=0;i--)
        {
            if(max_from_right<arr[i])
            {
                max_from_right=arr[i];
                System.out.print(max_from_right+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        print(arr,n);
        Naive(arr,n);
        Efficient(arr,n);

        sc.close();
    }
}
