package Java;

import java.io.*;

public class baekJoon_2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int up = Integer.parseInt(s[0]);
		int down = Integer.parseInt(s[1]);
		int length = Integer.parseInt(s[2]);
		int day = (length - down) / (up - down);

		if ((length - down) % (up - down) != 0) {
			day++;
		}
		bw.write(String.valueOf(day));
		bw.flush();
		bw.close();
		br.close();
	}
}
