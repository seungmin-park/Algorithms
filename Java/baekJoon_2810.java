package Java;

import java.io.*;
import java.util.Arrays;

public class baekJoon_2810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int leng = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split("");
		Arrays.sort(s);
		int lCount = 0;
		int sCount = 0;
		for(int i = 0; i < leng; i++){
			if(s[i].equals("L")){
				lCount++;
			}else{
				sCount++;
			}
		}
		bw.write(String.valueOf(lCount/2 + (sCount == leng ? sCount : sCount + 1)));
		bw.flush();
		bw.close();
		br.close();
	}
}
