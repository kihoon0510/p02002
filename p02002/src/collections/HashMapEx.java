package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		String[] data = {"A","K","A","K","D","K","A","K","A","Z","D"};
		
		HashMap map = new HashMap();
		for(int i=0;i<data.length;i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], value.intValue()+1);
			}else {
				map.put(data[i], 1);
			}
		}
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey()+" : "+printBar('#',value)+" " + value);
		}
	}
	
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("±âÅ¸", name, tel);
	}
	
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}
	
	
	
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * "+e.getKey()+"["+subSet.size()+"]");
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name+" " + telNo);
			}
			System.out.println();
		}
	}
	
	
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i<bar.length; i++)
			bar[i] = ch;
		
		return new String(bar);
	}
	
	static class ValueComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Entry) o1;
				Map.Entry e2 = (Entry) o2;
				
				int v1 = ((Integer)e1.getValue()).intValue();
				int v2 = ((Integer)e2.getValue()).intValue();
				return v2-v1;
			}
			return -1;
		}
		
	}
}























