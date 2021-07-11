package Java;

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 0; i < repeat; i ++){
			String[] s = br.readLine().split(" ");
			Arrays.sort(s);
			sum += Integer.parseInt(s[s.length-1]);
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}
