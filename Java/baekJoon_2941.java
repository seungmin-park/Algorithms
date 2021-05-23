package Java;

import java.io.*;

public class baekJoon_2941 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String[] croAlpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for(int i = 0; i < croAlpha.length; i++){
			if(s.contains(croAlpha[i])){//크로아티아문자 포함여부 탐색
				s = s.replace(croAlpha[i], "A");//포함할시 변경
			}
		}

		bw.write(String.valueOf(s.length()));
		bw.flush();
		bw.close();
		br.close();
	}
}
