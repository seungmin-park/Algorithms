package Java;

import java.io.*;

public class baekJoon_1436 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int num = 666;
		int count = 1;
		while(count != n){
			num++;
			if(String.valueOf(num).contains("666")){
				count++;
			}
		}
		bw.write(String.valueOf(num));
		bw.flush();
		bw.close();
		br.close();
	}
}
