public class isSubsequence {
    public static boolean Method(String str1,String str2)
    {
        int m=str1.length();
        int n=str2.length();

        int i=0,j=0;
        while (i<m && j<n)
        {
            if(str1.charAt(i)==str2.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        return j==n;
    }
    public static void main(String[] args)
    {
        String str1="alpha";
        String str2="lpm";

        System.out.println(Method(str1,str2));
    }
}
