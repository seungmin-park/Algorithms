package Java;

import java.io.*;

public class baekJoon_1929 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int min = Integer.parseInt(s[0]);
		int max = Integer.parseInt(s[1]);
		if(min == 1){
			min++;
		}
		for(int i = min; i <=max; i++){
			boolean flag = true;
			for(int j = 2; j <= Math.sqrt(i); j++){
				if(i%j == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				bw.write(String.valueOf(i));
				bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
