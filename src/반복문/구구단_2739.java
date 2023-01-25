package 반복문;

import java.util.Scanner;

public class 구구단_2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
			for (int j = 1; j <= 9; j++) {
				System.out.println(n + " * " + j + " = " + (n*j) );
			}
		sc.close();
	}
}
