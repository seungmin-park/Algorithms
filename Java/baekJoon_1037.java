package Java;

import java.io.*;
import java.util.Arrays;

public class baekJoon_1037 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] num = new int[repeat];
		for(int i = 0; i < repeat; i++){
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num);
		int result = num[0] * num[repeat-1];
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}