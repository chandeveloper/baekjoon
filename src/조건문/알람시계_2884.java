package 조건문;

import java.util.Scanner;

public class 알람시계_2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
	
		if (m >= 45) {
			m = m - 45;
			System.out.println(h + " " + m);
		}else if (m < 45) {
			if (h >= 1) {
				m = 60 - (45 - m);
				h = h -1;
				System.out.println(h + " " + m);
			}else if (h == 0) {
				m = 60 - (45 - m);
				h = 23;
				System.out.println(h + " " + m);
			}
			
		}
		
	}
}
