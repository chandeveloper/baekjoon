package 조건문;

import java.util.Scanner;

public class 주사위세개_2480 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = 0;
		
		while (result == 0) {
		if (a == b && a == c && b == c) {
			result = 10000 + a * 1000;
			System.out.println(result);
			break;
		}else if ((a == b || a == c) || b == c) {
			int sam = 0;
			if(a == b) sam = b;
			if(a == c) sam = c;
			if(b == c) sam = c;
			
			result = 1000 + sam * 100;
			System.out.println(result);
			break;
		}else {
			int max = a;
			if (b > max) max = b;
			if (c > max) max = c;
			
			result = max * 100;
			System.out.println(result);
			break;
		}
		}
		sc.close();
	}
}
