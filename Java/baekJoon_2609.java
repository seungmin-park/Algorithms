package Java;

import java.io.*;

public class baekJoon_2609 {
	public static int Euclidean(int x, int y){
		if(y == 0){
			return x;
		}
		int r = x%y;
		if(r == 0){
			return y;
		}
		int r2 = y%r;
		return Euclidean(r,r2);
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int x = Integer.parseInt(s[0]);
		int y = Integer.parseInt(s[1]);
		int min = Euclidean(x, y);
		int max = min * x/min *y/min;
		bw.write(String.valueOf(min));
		bw.write("\n");
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
		br.close();
	}
}
