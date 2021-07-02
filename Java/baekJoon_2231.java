package Java;

import java.io.*;

public class baekJoon_2231 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int number = Integer.parseInt(br.readLine());
		int result = Integer.MAX_VALUE;

		for(int i = 0; i <= number; i++){
			int temp = i + (i/1000000) + ((i%1000000)/100000) + ((i%100000)/10000) + ((i%10000)/1000) + ((i%1000)/100) + ((i%100)/10) + i%10;
			if(temp == number){
				result = i;
				break;
			}
		}
		if(result == Integer.MAX_VALUE){
			result = 0;
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
