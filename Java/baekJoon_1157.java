package Java;

import java.io.*;

public class baekJoon_1157 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        String s = br.readLine().toUpperCase();
		int[] alphabet = new int[26];//출력결과
		int max = -1;
		char result = '?';
		
		for(int i = 0; i < s.length(); i++){
			alphabet[s.charAt(i)-65]++;
			if(max <alphabet[s.charAt(i)-65]){
				max = alphabet[s.charAt(i)-65];
				result = s.charAt(i);
			}
			else if(max == alphabet[s.charAt(i)-65] ){
				result = '?';
			}
		}

		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
}