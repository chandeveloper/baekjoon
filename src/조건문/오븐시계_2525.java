package 조건문;

import java.util.Scanner;

public class 오븐시계_2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = a * 60 + b;
		min = min + c;
		
		int hour = (min / 60) % 24;	
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);
		sc.close();
	}
}
