package intro;

import java.util.Scanner;


public class main {

	public static boolean ByWhileLoop(Scanner number)
	{
		int sayi = number.nextInt();
		int i = 0;
        
        while (sayi > 1) { 

            if (sayi % 2 == 0) 
            {
                i = 1;
            } 
            else 
            { 
                break; 
            }
            sayi = (sayi / 2);
        }
        if (i == 1) {
            return true;
        } else {
            return false;
        }
	}
	
	public static boolean ByDoWhileLoop(Scanner number)
	{   
		int sayi = number.nextInt();
		int i = 0;
		
		if(sayi>1) {
			do{
				if (sayi % 2 == 0) 
	            {
	                i = 1;
	            } 
	            else 
	            { 
	                break; 
	            }
	            sayi = (sayi / 2);
	            
			}while (sayi > 1);
		}
		
		if (i == 1) {
            return true;
        } else {
            return false;
        }
		
	}
	
	public static boolean ByForLoop(Scanner number)
	{
		int sayi = number.nextInt();
		int k = 0;
		
		for(int i=0;i<sayi;i++)
		{
			    if (sayi % 2 == 0) 
	            {
	                k = 1;
	            } 
	            else 
	            { 
	                break; 
	            }
	            sayi = (sayi / 2);
		}
		
		if (k == 1) {
            return true;
        } else {
            return false;
        }
	}
	
	
	public static void main(String[] args) {
		
		    System.out.println("enter a number");
		    Scanner scanner = new Scanner(System.in);
		    
		    if(ByWhileLoop(scanner))	    
		    	System.out.println("2'nin kuvveti (WhileLoop)");
		    else
		     System.out.println("2'nin kuvveti değil(WhileLoop)");
		    
		    
		    if(ByForLoop(scanner))		    
		    	 System.out.println("2'nin kuvveti (ForLoop)");
		    else
		    	System.out.println("2'nin kuvveti değil(ForLoop)");
		    
		    if(ByDoWhileLoop(scanner))		    
		    	System.out.println("2'nin kuvveti (DoWhileLoop)");
		    else
		    	System.out.println("2'nin kuvveti değil(DoWhileLoop)");
		    
		    
		    
	}

}
