package Java;

import java.io.*;
import java.util.Arrays;

public class Greedy_practice3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		Arrays.sort(s);

		int result = 0;
		int count = 0;
		for(int i = 0; i< repeat; i++){
			count++;
			if(count >= Integer.parseInt(s[i])){
				result++;
				count = 0;
			}
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
