import java.util.ArrayList;

public class searchpattern {
    class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        ArrayList<Integer> a=new ArrayList<Integer>();
        int m=pattern.length();
        int n=text.length();
        int c=0;
        for(int i=0;i<n-m+1;i++)
        {
            String s1=text.substring(i,i+m);
            if(s1.equals(pattern))
            {
                a.add(i+1);
                c++;
            }
        }
        //System.out.println(c);
        return a;
    }
}
}
