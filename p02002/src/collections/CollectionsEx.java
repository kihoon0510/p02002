package collections;

import java.util.ArrayList;
import static java.util.Collections.*;
import java.util.List;

public class CollectionsEx {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		rotate(list, 2);
		System.out.println(list);
	}
}
