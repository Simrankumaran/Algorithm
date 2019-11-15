package Algorithms;
import java.util.*;
public class Naive 
{
	public static void Naivesearch(String pattern, String givenstr) 
	    { 
	        int m = pattern.length(); 
	        int n = givenstr.length(); 
	  	    int flag=0,i=0; 
	        for (i = 0; i <= n - m; i++)
	        {	  
	            int j; 
	  
	            //For current index i, check for pattern  match 
	            for (j = 0; j < m; j++) 
	                if (givenstr.charAt(i + j) != pattern.charAt(j)) 
	                    break; 
	  
	            if (j == m) {// if pattern found in the given string
	                flag=1;
	            }
	        }
	        if(flag==1)
	        	System.out.println("Pattern found"); 
	        else
	        	System.out.println("Pattern not found"); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the string: ");
	        String givenstr=sc.next();
	        System.out.println("Enter the Pattern to be matched: ");
	        String pattern = sc.next();
	        Naivesearch(pattern,givenstr); 
	    } 
	} 


