package 반복문;

import java.util.Scanner;

public class 합_8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum+=i;
		}
		System.out.println(sum);
		sc.close();
	}
}
