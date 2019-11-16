package Algorithms;
public class BMA
{
	String zx=" ";
	/*public static void main(String[] args)
    {
        //(BoyerMoore("Is the pattern a substring?", "substr"));
    }*/

    public boolean BoyerMoore(String T, String P)
    {
        int flag=0,pos=0;
    	int i = P.length() -1;
        int j = P.length() -1;
        do
        {
            if (P.charAt(j) == T.charAt(i))
            {
                if (j == 0)
                {
                    pos=i;
                    flag=1;// pattern found
                    System.out.println("Pattern found at position: "+ pos);
                    zx=zx+" "+pos;
                    break;
                	
                }
                else
                {
                    i--;
                    j--;
                }
            }
            else
            {
                i = i + P.length() - min(j, 1+last(T.charAt(i), P));    
                j = P.length()-1;
            }
        } while(i <= T.length()-1);

        if(flag==1)
        {
        	System.out.println("Pattern found at position: "+ pos);
        	return true;
        }
        else {
        	System.out.println("Pattern not found");
        	return false;
        }
    }
    // Returns index of last occurrence of character in pattern.

    public static int last(char c, String P)
    {
        for (int i=P.length()-1; i>=0; i--)
        {
            if (P.charAt(i) == c)
            {
                return i;
            }
        }
        return -1;
    }


    // Returns the minimum of two integers.
     public static int min(int a, int b)
    {
        if (a < b)
            return a;
        else if (b < a)
            return b;
        else 
            return a;
    }
}