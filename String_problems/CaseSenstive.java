// Write a prgram such that the input word HoUse must be replaced with house, and the word ViP — with VIP. If a word contains an equal number of uppercase and lowercase letters, you should replace all the letters with lowercase ones. For example, maTRIx should be replaced by matrix. Your task is to use the given method on one given word.
import java.util.*;
public class CaseSenstive
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int lc = 0, uc = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
                lc++;
            else
                uc++;
        }
        System.out.println(lc>uc ? str.toLowerCase() : str.toUpperCase());
    }
}