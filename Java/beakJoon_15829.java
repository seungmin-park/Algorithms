package Java;

import java.io.*;

public class beakJoon_15829 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		long sum = 0;
		long r = 1;
		long MOD = 1234567891;
		String s = br.readLine();
		for(int i = 0; i < repeat; i++){
			sum = (sum + (s.charAt(i) - 'a' + 1) * r) % MOD;
			r = (r * 31) % MOD;
		}
		bw.write(String.valueOf(sum));
        
		bw.flush();
		bw.close();
		br.close();
	}
}