package myException;

public class MyException extends Exception {

	private final int ERR_CODE;
	
	public MyException(String msg, int errCode) {
		super(msg);
		this.ERR_CODE = errCode;
		
	}
	
	public MyException(String msg) {
		this(msg, 100);
	}
}
