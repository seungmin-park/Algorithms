package Java;

import java.io.*;

public class baekJoon_21867 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int wordLength = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < wordLength; i++){
			if(s.charAt(i) != 'J' && s.charAt(i) != 'A' && s.charAt(i) != 'V'){
				sb.append(s.charAt(i));
			}
		}
		if(sb.length() == 0 || wordLength == 0){
			bw.write("nojava");
		}
		else{
			bw.write(sb.toString());
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
