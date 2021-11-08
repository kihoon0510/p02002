package scanner;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		
		while(sc.hasNext()) {
			sum += sc.nextInt();
			cnt++;
		}
		
		System.out.println("sum = "+sum);
		System.out.println("average = "+ (double)sum/cnt);
		sc.close();
	}
}