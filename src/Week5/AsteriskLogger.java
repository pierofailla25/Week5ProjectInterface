package Week5;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String input1) {
		// TODO Auto-generated method stub
		System.out.println("***" + input1 + "***");
	}

	@Override
	public void error(String input2) {
		// TODO Auto-generated method stub
		System.out.println("****************");
		System.out.println("*** ERROR: " + input2 + "***");
		System.out.println("****************");
		
		
		
		
	}

	
	
	
	
}
