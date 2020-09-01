
// Input
// The first line contains a non-empty string s with length at most 50 characters, containing lowercase English letters only.

// Output
// If there is such a substring in s that is not a palindrome, print the maximum length of such a substring. Otherwise print 0.

// input:         input:        input:
// mew            wuffuw        qqqqqqqq
            
// output:        output:       output:
// 3              5             0

// input:                                                       
// wobervhvvkihcuyjtmqhaaigvvgiaahqmtjyuchikvvhvrebow           
// output:                                                      
// 49                                                           

import java.util.*;
public class Antipalindrome 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        int k = str.length();;
        int ans = 0;

        StringBuffer r = new StringBuffer(str);
        String rev = r.reverse().toString();

        if(str.chars().distinct().count() == 1)
            ans = 0;
        else
            for(int i = 0; i < str.length() && i <= k ; i++)
            {
                r = new StringBuffer(str.substring(i, k));
                rev = r.reverse().toString();

                if(!str.substring(i, k).equals(rev))
                {
                    ans = str.length();break;
                }
                else
                    ans = (str.length()-1);
                k--;
            }
        System.out.println(ans);
    }
}