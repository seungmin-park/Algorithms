package Java;

import java.io.*;

public class baekJoon_2292 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int value = 1;
		int result = 0;
		while(true){
			result++;
			if(value >= num){
				bw.write(String.valueOf(result));
				break;
			}
			else{
				value += 6* result;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
