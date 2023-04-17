package corepractice;

public class DemoException extends Exception {
	
	public DemoException(String message) {
		super(message);
	}
	public DemoException() {
		
	}
	
	public void myException(int input) throws DemoException {
		
		if(input>10) {
			throw new DemoException("This is my exception");
		}
		else {
			System.out.println("Everything good");
		}
	}

	public static void main(String[] args) throws DemoException {
		
		DemoException exception = new DemoException();
		exception.myException(100);

	}

}
