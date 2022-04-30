public class isPalindrome {

    public static boolean Method(char ch[],int l,int r)
    {
        while (l<=r)
        {
            if (ch[l]!=ch[r])
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str="namag";
        char ch[]=str.toCharArray();

        int l=0;
        int r=ch.length-1;

        System.out.println(Method(ch,l,r));

    }
}
