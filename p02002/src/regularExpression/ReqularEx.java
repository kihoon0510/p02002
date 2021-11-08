package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReqularEx {

	public static void main(String[] args) {
		
		String data = "fcowboy";
		
		Pattern p = Pattern.compile("c[a-z]*");
		Matcher m = p.matcher(data);
		if(m.matches()) {
			System.out.println(data);
		}else {
			System.out.println("no result");
		}
	}
}
