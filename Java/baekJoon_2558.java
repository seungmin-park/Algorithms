package Java;

import java.io.*;

public class baekJoon_2558 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(num1 + num2));
		bw.flush();
		bw.close();
		br.close();
	}
}
