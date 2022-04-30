public class LeftMostRepeatingChar {

    public static int Naive(String str)
    {
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j))
                {
                    return i;
                }
            }
        }
        return -1;
    }

    static int CHAR=256;
    public static int Efficient(String str)
    {
        int count[]=new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if((count[str.charAt(i)]>1))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
         String str="geeksforgeeks";
         System.out.println(Naive(str));
         System.out.println(Efficient(str));
    }
}
