package utill;

import java.util.Objects;
import java.util.Random;

/**
 * java.utill ��Ű�� ����.
 * @author ����
 *
 */
public class PracticeUtill {
	
	String name;
	
	/**
	 * Objects Ŭ������ ����.
	 * @param name - null���� ���� ����(requireNonNull �޼ҵ� ���).
	 */
	void setName(String name) {
		this.name = Objects.requireNonNull(name,"name must not be null.");
	}
	
	/**
	 * Objects.equals() - �� ��ü�� ���Ѵ�.(null���� Ȯ���� �ʿ䰡 ����.) 
	 * Object.equals()�� ��ü�� null���� �ݵ�� Ȯ���ؾ� �Ѵ�.
	 * Object.deepEquals()�� ��ü�� ��������� ���ϱ� ������ ������ �迭�� �񱳵� ����.
	 * @param a
	 * @param b
	 */
	boolean isEqual(Object a, Object b) {
		if(a != null && a.equals(b)) {
			System.out.println("Object.equals(): a �� b �� ����.");
			return true;
		}
		
		if(Objects.equals(a, b)) {
			System.out.println("Objects.equals(): a �� b �� ����.");
			return true;
		}
		
		if(Objects.deepEquals(a, b)) {
			System.out.println("Objects.deepEquals(): a �� b �� ����.");
			return true;
		}
		
		int num = new Random().nextInt();
		
		return false;
		
	}
}
