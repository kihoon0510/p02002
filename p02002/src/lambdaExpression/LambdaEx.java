package lambdaExpression;

public class LambdaEx {
	static void execute(MyFunction f) {
		f.myMethod();
	}
	
	static MyFunction getMyFunction() {
		MyFunction f = ()->System.out.println("getMyFunction()");
		return f;
	}
	
	public static void main(String[] args) {
		MyFunction f1 = ()->System.out.println("f1");
		
		MyFunction f2 = new MyFunction() {
			
			@Override
			public void myMethod() {
				System.out.println("f2");
			}
		};
		
		MyFunction f3 = getMyFunction();
		
		execute(f1);
		execute(f2);
		execute(f1);
	}
}
