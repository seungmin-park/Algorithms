package Java;

import java.io.*;

public class baekJoon_10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split("");
		int[] x = new int[26];
		for(int i = 'a'; i <= 'z'; i++){
			for(int j = 0; j <s.length;j++){
				if(s[j].equals(String.valueOf((char)i))){
					x[i-97] = j;
					break;
				}
				else{
					x[i-97] = -1;
				}
			}
		}
		for(int i : x){
			bw.write(String.valueOf(i) + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
