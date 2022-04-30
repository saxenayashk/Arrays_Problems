import java.util.*;

public class StockBuyAndSell {

    public static int Method(int price[],int start,int end)
    {
        if(start>=end) return 0;

        int profit=0;
        for(int i=start;i<end;i++)
        {
            for (int j = i+1; j <=end ; j++) {

                if(price[j]>price[i])
                {
                    int curr_profit=price[j]-price[i]+Method(price,start,i-1)+Method(price,j+1,end);
                    profit=Math.max(profit,curr_profit);
                }
            }
        }
        return profit;
    }

    public static int Efficient(int price[],int n)
    {
        int profit=0;
        for(int i=1;i<n;i++)
        {
            if(price[i]>price[i-1])
            {
                profit+=(price[i]-price[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args)
    {
        int profit[]={1,5,3,8,12};
        int start=0;
        int end=profit.length-1;

        System.out.println(Method(profit,start,end));
        System.out.println(Efficient(profit,profit.length));
    }
}
