package day1;

public class Mobile 
{
	public boolean makeCall(long number) {
		System.out.println("Dailing Number :" + number);
		return true;
		
	}
	
	public  String sendSMS(String text) {
		System.out.println("Text Message : " +text);
		return text;
		
	}

	public String shutDown() {
		System.out.println("Bye Bye");
		return "shutdown";
		
	}



public static void main (String [] args) 
{
	Mobile mob = new Mobile();
		
	mob.makeCall(9994208086l);
	mob.sendSMS("Hello");
	mob.shutDown();
}


}
