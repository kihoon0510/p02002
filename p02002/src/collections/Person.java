package collections;

import java.util.Objects;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	/*
	 * set.add() 메서드는 내부적으로 equals() 와 hashCode()를 호출하여 기존의 저장된 요소인지 판별한다.
	 * 따라서 해당 메서드들을 오버라이드 해줘야 한다.
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
	
	@Override
	public String toString() {
		return name+":"+age;
	}
}
