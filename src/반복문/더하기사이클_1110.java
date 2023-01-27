package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 더하기사이클_1110 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = n;
		int ten = 0;
		int one = 0;
		int cnt = 0;
		while (true) {
			ten = sum/10;
			one = sum%10;
			
			sum = ten + one;
			
			sum = one * 10 + sum %10;
			cnt++;
			if (n == sum) {
				  break;                              
			}
		}
		System.out.println(cnt);
		
		br.close();
		bw.close();
	}
}
