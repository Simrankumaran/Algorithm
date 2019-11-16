package Algorithms;
import java.util.*;
import java.lang.*;
public class Execute
{
	public static void main(String args[])
	{
		Naive obj1 =new Naive();
		Rabin_karp obj2=new Rabin_karp();
		KMP obj3=new KMP();
		BMA obj4=new BMA();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
        String givenstr=sc.nextLine();
        System.out.println("Enter the Pattern to be matchAed: ");
        String pattern = sc.next();
        
        while(true) {
        System.out.println("CHOOSE A STRING MATCHING ALGORITHM: /n1.Naive /n2.Rabin Karp /n3.Knuth Moris Patt /n4.Boyer Moore /n5.Exit ");
        int choice=sc.nextInt();
        
        switch(choice)
        {
        case 1: obj1.Naivesearch(pattern, givenstr);
                break;
              
        case 2: int q=101;
        	    obj2.RKsearch(pattern,givenstr,q);
                break;
         
        case 3:obj3.KMPmatcher(givenstr,pattern);
               break;
        case 4:obj4.BoyerMoore(givenstr,pattern);  
               break;
               
        case 5: System.exit(0);       
        default:System.out.println("Invalid Input");
        
        }
        
        }
		
	}

}
