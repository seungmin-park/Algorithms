package Java;

import java.io.*;

public class Greedy_practice2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split("");
		int sum = Integer.parseInt(s[0]);
		for(int i = 1; i < s.length; i++){
			int num1 = Integer.parseInt(s[i]);
			if(num1 <= 1 || sum <= 1){
				sum += num1;
			}
			else{
				sum *= num1;
			}
		}
		
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}
