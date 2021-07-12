package Java;

import java.io.*;

public class Greedy_practice1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		int count = 0;
		while(n != 1){
			if(n%k == 0){
				n /= k;
				count++;
			}else{
				n--;
				count++;
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
