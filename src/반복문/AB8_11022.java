package 반복문;

import java.util.Scanner;

public class AB8_11022 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 1; i <= t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+i+": "+ (a-b));
		}
	sc.close();
	}
}
