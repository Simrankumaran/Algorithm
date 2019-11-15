package Algorithms;
public class Rabin_karp
{
	    //number of characters in the input alphabet 
	    public final static int d = 256; 
	      
	    void RKsearch(String pat, String txt, int q) 
	    { 
	        int M = pat.length(); 
	        int N = txt.length(); 
	        int i, j,flag=0; 
	        int p = 0; // hash value for pattern 
	        int t = 0; // hash value for txt 
	        int h = 1; 
	      
	        for (i = 0; i < M-1; i++) 
	            h = (h*d)%q; 
	      
	        // Calculate the hash value of pattern and first window of text
	        for (i = 0; i < M; i++) 
	        { 
	            p = (d*p + pat.charAt(i))%q; 
	            t = (d*t + txt.charAt(i))%q; 
	        } 
	      
	        // checking for pattern
	        for (i = 0; i <= N - M; i++) 
	        { 
	      
	            // Check the hash values of current window of text 
	            // and pattern. If the hash values match then only 
	            // check for characters on by one 
	            if (p == t) 
	            { 
	                 //checking each character
	                for (j = 0; j < M; j++) 
	                { 
	                    if (txt.charAt(i+j) != pat.charAt(j)) 
	                        break; 
	                } 
	      
	                // if pattern exists in text
	                if (j == M) {
	                	flag=1;
	                    System.out.println("Pattern found at index " + i); }
	            } 
	      
	            if ( i < N-M ) 
	            { 
	                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q; //calculating hash value
	      
	                //making t positive
	                if (t < 0) 
	                t = (t + q); 
	            } 
	        }
	        if(flag==0)
                System.out.println("Pattern not found");
	        	
	    } 
	      
	    /* Driver program to test above function 
	    public static void main(String[] args) 
	    { 
	        String txt = "Hello world"; 
	        String pat = "ell"; 
	        int q = 101; // A prime number 
	        //RKsearch(pat, txt, q); 
	    } */
	} 
	 
