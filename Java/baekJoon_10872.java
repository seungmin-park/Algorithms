package Java;

import java.io.*;

public class baekJoon_10872 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.write(String.valueOf(fac(n)));
        
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
