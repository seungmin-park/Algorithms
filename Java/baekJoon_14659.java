package Java;

import java.io.*;

public class baekJoon_14659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int leng = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] arrows = new int[leng];
		for(int i = 0; i < leng; i ++){
			arrows[i] = Integer.parseInt(s[i]);
		}
		int killCount = 0;
		int result = -1;
		for(int i = 0; i < leng; i++){
			killCount = 0;
			for(int j = i+1; j< leng; j++){
				if(arrows[i] >arrows[j]){
					killCount++;
				}
				else{
					break;
				}
			}
			result = Math.max(result, killCount);
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
