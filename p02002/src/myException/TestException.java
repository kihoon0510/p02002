package myException;

public class TestException {
	public static void main(String[] args) {
		boolean result = false;
		try {
		 result = isTrue("hi mysdfsdf errCode dsfsdf");
		}catch(MyException e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}
	
	
	static boolean isTrue(String msg) throws MyException {
		if(msg.contains("errCode")) {
			MyException exception = new MyException("errCode 포함된 에러");
			throw exception;
		}
		
		return true;
	}
}

class EeException extends RuntimeException{
	private final int ERR_CODE;
	public EeException(String msg, int errCode) {
		super(msg);
		this.ERR_CODE = errCode;
	}
	
	public EeException(String msg) {
		this(msg, 100);
	}
}