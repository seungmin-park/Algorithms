package Java;

import java.io.*;

public class baekJoon_11050 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int r = Integer.parseInt(s[1]);
		bw.write(String.valueOf(fac(n)/(fac(r)*fac(n-r))));
        
		bw.flush();
		bw.close();
		br.close();
	}
	static int fac(int N){
		if(N == 0){
			return 1;
		}
		return N * fac(N - 1);
	}
}
