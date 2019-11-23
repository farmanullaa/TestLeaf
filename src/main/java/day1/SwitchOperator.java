package day1;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		int i=2; int j=3; 

		// Declare a String variable with input as operations (Tip:
		String input="sub";
		int finalOP;
		switch (input) {
		case "add":
			finalOP = i+j;
			System.out.println("add : " +finalOP);
			break;
		case "mul":
			finalOP = i*j;
			System.out.println("mul : " +finalOP);
			break;
		case "sub":
			finalOP = i-j;
			System.out.println("sub : "+finalOP);
			break;

		default:
			System.out.println("Provide appropriate operater value");
			break;
		}
		// Initiate switch case for operations
		
		
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
