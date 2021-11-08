package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		Person p = new Person("David",10);
		int hashCode1 = p.hashCode();
		int hashCode2 = p.hashCode();
		
		System.out.println(hashCode1);
		System.out.println(hashCode2);
		
		System.out.println(p.equals(new Person("David",10)));
		
		p.age = 30;
		int hashCode3 = p.hashCode();
		System.out.println(hashCode3);
		
		System.out.println(set);
		
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A: "+setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B: "+setB);
		
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))
				setKyo.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		System.out.println("A¡ûB: "+setKyo);
		System.out.println("A¡úB: "+setHab);
		System.out.println("A-B: "+ setCha);
	}
}
