package Java;

import java.io.*;

public class baekJoon_10162 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] time = {300,60,10};
		int[] result = {0,0,0};
		int x = Integer.parseInt(br.readLine());
		int sum = 0;
		if(x >= time[0]){
			sum = x/time[0];
			result[0] +=sum;
			x %= time[0];
		} if(x >= time[1]){
			sum = x/time[1];
			result[1] += sum;
			x = x%time[1];
		} if(x >= time[2]){
			sum = x/time[2];
			result[2] += sum;
			x %= time[2];
		}
		if(x != 0){
			System.out.println(-1);
			return;
		}else{
			System.out.println(result[0]+" "+result[1]+" "+result[2]);
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
