package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		Set ts = new TreeSet();
		for(int i=0;i<6;i++) {
			int ran = (int) (Math.random()*45);
			ts.add(ran);
		}
		
		System.out.println(ts);
		
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from " + from+ " to "+to);
		System.out.println("result1 : "+ set.subSet(from, to));
		System.out.println("result2 : "+set.subSet(from, to+"zzz"));
		
		TreeSet set2 = new TreeSet();
		int[] score = {80,95,50,35,45,65,10,100};
		for(int i=0; i<score.length;i++) 
			set2.add(score[i]);
		System.out.println("50보다 작은 값 : "+set2.headSet(50));
		System.out.println("50보다 큰 값: "+set2.tailSet(50));
	}
}
