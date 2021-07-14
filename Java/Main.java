package Java;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split("");
		Integer[] num = new Integer[s.length];
		for(int i = 0; i < s.length; i++){
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num, Collections.reverseOrder());
		for(int x : num){
			bw.write(String.valueOf(x));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
