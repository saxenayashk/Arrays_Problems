import java.util.*;

public class UniqueOccurencesOfEle {
    public static boolean Method(int arr[],int n)
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr)
        {
            hs.add(x);
        }

        int count[]=new int[hs.size()];
        int j=0;

        for(int x:hs)
        {
            for(int i=0;i<n;i++)
            {
                if(x==arr[i])
                {
                    count[j]++;
                }
            }
            j++;
        }

        Arrays.sort(count);

        for(int i=0;i<count.length-1;i++)
        {
            if(count[i]==count[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,2,3,3,3,4,4,4,4};
        int n=arr.length;

        System.out.println(Method(arr,n));
    }
}
