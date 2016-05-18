package comcast;

import java.util.Scanner;

public class Tax_person {
	
	/*
	 * Initialize the parameters
	 * set final for the tax 
	 * 
	 */
	static double total;
	static final double Necessary_tax = 0.01;  
    static final double Luxary_tax = 0.09;      
    static String code =null;
	static String desc = null;
	   
    static double price = 0;  
    static double tax; // tax for the item (calculated using price * tax)
   
	public static void main(String[] args) {
	
	    input();
    
    	calc_tax(desc,price,tax);
    
	}
	
	public static void calc_tax( String desc, double price, double tax){
		System.out.println(tax);
		total=price+( price * tax);
		System.out.println(" The item description  :"+desc  );
		System.out.println(" The item Price is  :$"+price  );
		System.out.println(" The tax percentage is:"+tax  );
		System.out.println(" The total cost is  :$"+total  );
		
		
	}
	
	public static void input(){
		@SuppressWarnings("resource")
		Scanner s1 = new Scanner(System.in); //display prompts and get input

		   System.out.print("Item description:  "); 
		   desc=s1.nextLine();
		   System.out.print("Item price:  $"); // prompt for price
		   //price=s1.nextDouble(); 
		   //
		   //Accept the input only when you enter double value
		   while (true) {
			    System.out.println("Item price  (including cents):$");
			    try {
			        price= Double.parseDouble(s1.next());
			        break; // will only get to here if input was a double
			    } catch (NumberFormatException ignore) {
			        System.out.println("Invalid input");
			    }
			}
		
		   System.out.println("Item Code : type 'N' or 'l'");
		   code =s1.next();
		   
		 // Code validation
		   
		   if(code.contains("n")||(code.contains("N")))
			   {
			   
			   tax=Necessary_tax;
			   
		      } else if(code.contains("l")||(code.contains("L")))
		         {
			         tax=Luxary_tax;
		         }
		   
		          else{
			   
			      System.out.println(" Invalid code  ");
			      System.out.println(" Please start once again ");
			      input();
			     
		          }
		
	}
}

