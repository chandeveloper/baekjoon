package 반복문;

import java.util.Scanner;

public class 영수증_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalprice = sc.nextInt();
		int totalcount = sc.nextInt();
		
		int total = 0;
		
		for (int i = 0; i < totalcount; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			total += price*num;
			}
		if(total == totalprice) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
	sc.close();
	}
}
