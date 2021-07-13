package Java;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int R1 = Integer.parseInt(s[0]);
		int S = Integer.parseInt(s[1]);

		bw.write(String.valueOf(S*2-R1));
		bw.flush();
		bw.close();
		br.close();
	}
}
