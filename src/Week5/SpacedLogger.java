package Week5;

public class SpacedLogger implements Logger {
	
	
	@Override
	public void log(String input1) {
		char [] miami = input1.toCharArray();
		StringBuilder hurricanes = new StringBuilder();
		for(int i = 0; i < miami.length; i++) {
			hurricanes.append(miami[i]);
			if (i < miami.length - 1) {
				hurricanes.append(" ");
			}
		}
		System.out.println(hurricanes.toString());
	}

	@Override
	public void error(String input2) {
		char [] grand = input2.toCharArray();
		StringBuilder vice = new StringBuilder();
		vice.append("ERROR: ");
		for(int i = 0; i < grand.length; i++) {
			vice.append(grand[i]);
			if (i < grand.length - 1) {
				vice.append(" ");
			}
		}
		System.out.println(vice.toString());
		
	}

}









//5. Implement the SpacedLogger methods:

//Note:  The SpacedLogger should add a space or " " between each character of the 
//String argument passed into its methods.


//a. If the log method received “Hello” as an argument, it should print H e l l o

//b. The error method should do the same, but with “ERROR:” preceding the spaced 
//out input (i.e. ERROR: H e l l o)

