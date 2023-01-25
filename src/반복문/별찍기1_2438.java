package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기1_2438 {

public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		String star = "*";
		for (int i = 1; i <= t; i++) {
			bw.write(star+ "\n");
			star += "*";
		}
		bw.flush();
		bw.close();
	}
}
