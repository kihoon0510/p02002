package networking;

import java.net.ServerSocket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TcpIpServer {
	ServerSocket serverSocket;
	Thread[] threadArr;

	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = 'a' + 1;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(++c2);
		System.out.println(c1 + 1);

		float f3 = 0.123456789012345678901234567890f;
		float f4 = 0.1000000000000000000000000000f;
		double d2 = 0.10000000000000000000000;
		System.out.println((double) f4);
		System.out.println(d2);
		System.out.println(10.0f == 10.0);
		System.out.println(0.1f == 0.1);
		System.out.println((double) 0.1f);
		System.out.println(0.123456789012345678901234567890);
		System.out.println(0.123456789012345678901234567890f);
		System.out.println((double) f3);
		System.out.println(0.1f);
		System.out.println(0.1);
		System.out.println(1.1f == (float) 1.1);
		char x = 'A';
		final int ONE = 1;
		switch (x) {
		case 0:
			System.out.println("x = 1");
		case ONE:
			System.out.println("x = 2");
		case 'A':
			System.out.println("x = 65 = A");
//			break;
		default:
			System.out.println("default: x = " + x);
		}
		String str = "Three";
		switch (str) {
		case "One":
			System.out.println("One");
			break;
		case "Two":
			System.out.println("Two");
			break;
		case "Three":
			System.out.println("Three");
			break;
//		case 4:
//			System.out.println("Four");
//			break;
		default:
			System.out.println("default");
		}
		boolean bool = true;
		if (bool) {
			System.out.println("x가 참일때 실행");
		} else {
			System.out.println("x가 거짓일 때 실행");
		}

		if (bool) {

		} else if (bool) {

		} else if (bool) {

		} else {

		}

//		int ch = 65;
		char d = 'd';
		char e = ++d;
		char f = (char) (e + 1);
		System.out.println(e);
//		System.out.println((char)ch);
		System.out.println(f);

		int shift = 20 >> 2;

		int y = 0;
		for (;;) {
			if (y == 100) {
				break;
			}
			y += 2;
			System.out.println("y: " + y);
		}
		for (int i = 0;; i++) {
			if (i == 100) {
				break;
			}
			System.out.println("i: " + i);
		}

		for (char ch = 'a'; ch <= 'z'; ch++)
			System.out.print(ch);
		for (float vava = 1.3f; vava < 3.4f; vava += 0.1f)
			System.out.println(vava);

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i : a) {
			System.out.println(i);
		}
		int i2 = 10;
		while (i2-- != 0)
			System.out.println("조건식이 참인동안 반복: " + i2);

		do {
			System.out.println("최소한 한번은 수행됨.");
		} while (false);

		String str1 = "hi!";
		String str2 = new String("hi!");
		System.out.println("str1 == str 2: " + (str1 == str2));
		System.out.println("str1 equals str 2: " + (str1.equals(str2)));

		int z = 1;
		myWhile: while (true) {
			System.out.println("z: " + z);
			if ((z++) == 10) {
				for (int h = 0; h < 10; h++) {
					if (h == 7) {
						System.out.println("z+h= " + (z + h));
						break myWhile;
					}
				}
			}
		}
		System.out.println("while문 종료.");
		System.out.println((int) (0.123456789123456789 * 1e10));
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,10,12,13,14};
		int result = 0;
		result: for(int c=0; c<arr.length-1; c++) {
			for(int b=c+1; b<arr.length; b++ ) {
				if(arr[c] == arr[b]) {
					result = arr[b];
					break result;
				}
			}
		}
		System.out.println("중복된 숫자: "+result);
		
		ArrayList<String> strs = new ArrayList<String>();
		strs.add("hi");
		for(String st : strs) {
			System.out.println(st);
		}
		
		System.out.println((int)5*1.5);
		
		char c23 = 'a';
		char c234 = 'a'+1;
		
		System.out.println(c23+1);
		
		int score = 79;
		float result1 = 0.0f;
		result1 = (score>80)? 80.0f : 40;
		System.out.println(result1);
		
		
	}

	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
