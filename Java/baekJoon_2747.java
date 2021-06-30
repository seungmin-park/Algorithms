package Java;

import java.io.*;

public class baekJoon_2747 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[1000];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 0; i < n ; i++){
			arr[i+2] = arr[i] + arr[i+1];
		}
        
		bw.write(String.valueOf(arr[n]));
		bw.flush();
		bw.close();
		br.close();
	}
}
