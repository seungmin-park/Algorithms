package Java;

import java.io.*;
import java.util.Arrays;

public class baekJoon_10817 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int[] arr = new int[3];
		for(int i = 0; i < arr.length; i++){
			arr[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(arr);
		
		bw.write(String.valueOf(arr[1]));
		bw.flush();
		bw.close();
		br.close();
	}
}
