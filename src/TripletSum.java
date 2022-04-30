public class TripletSum {
    public static void Method(int arr[],int n,int x)
    {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if((arr[i]+arr[j]+arr[k])==x)
                    {
                        System.out.print(i+"  "+j+"  "+k);
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int x=12;

        Method(arr,n,x);
    }
}
