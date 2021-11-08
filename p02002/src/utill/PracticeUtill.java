package utill;

import java.util.Objects;
import java.util.Random;

/**
 * java.utill 패키지 연습.
 * @author 기훈
 *
 */
public class PracticeUtill {
	
	String name;
	
	/**
	 * Objects 클래스를 연습.
	 * @param name - null값을 받지 않음(requireNonNull 메소드 사용).
	 */
	void setName(String name) {
		this.name = Objects.requireNonNull(name,"name must not be null.");
	}
	
	/**
	 * Objects.equals() - 두 객체를 비교한다.(null인지 확인할 필요가 없다.) 
	 * Object.equals()는 객체가 null인지 반드시 확인해야 한다.
	 * Object.deepEquals()는 객체를 재귀적으로 비교하기 때문에 다차원 배열의 비교도 가능.
	 * @param a
	 * @param b
	 */
	boolean isEqual(Object a, Object b) {
		if(a != null && a.equals(b)) {
			System.out.println("Object.equals(): a 와 b 가 같다.");
			return true;
		}
		
		if(Objects.equals(a, b)) {
			System.out.println("Objects.equals(): a 와 b 가 같다.");
			return true;
		}
		
		if(Objects.deepEquals(a, b)) {
			System.out.println("Objects.deepEquals(): a 와 b 가 같다.");
			return true;
		}
		
		int num = new Random().nextInt();
		
		return false;
		
	}
}
