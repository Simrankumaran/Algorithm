package Algorithms;
public class KMP
{
	   String zx=" ";
	   /* public static void main(String[] args) {
	        final String givenstr = "AAAAABAAABA";        //This is the full string
	        final String pattern= "AAAA";                //This is the substring that we want to find
	        KMPmatcher(haystack, needle);
	    }*/

	    boolean KMPmatcher(String givenstr, String pattern) {
	        int m = givenstr.length();
	        int n = pattern.length();
	        int flag=0;
	        int[] pi = computePrefixFunction(pattern);
	        int q = 0;
	        for (int i = 0; i < m; i++) {
	            while (q > 0 && givenstr.charAt(i) != pattern.charAt(q)) {
	                q = pi[q - 1];
	            }

	            if (givenstr.charAt(i) == pattern.charAt(q)) {
	                q++;
	            }

	            if (q == n) {
	            	flag=1;
	                System.out.println("Pattern found at " + (i + 1 - n));
	                q = pi[q - 1];
	                zx=zx+" "+(i + 1 - n);
	            }
	        }
	        if(flag==0) {
                System.out.println("Pattern not found");
                return false;
	        }
	        else {
	        	return true;
	        }
	    }

	    // return the prefix function
	    static int[] computePrefixFunction(final String P) {
	        final int n = P.length();
	        final int[] pi = new int[n];
	        pi[0] = 0;
	        int q = 0;
	        for (int i = 1; i < n; i++) {
	            while (q > 0 && P.charAt(q) != P.charAt(i)) {
	                q = pi[q - 1];
	            }

	            if (P.charAt(q) == P.charAt(i)) {
	                q++;
	            }

	            pi[i] = q;

	        }
	        return pi;
	    }
	}

