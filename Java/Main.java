package Java;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String[] croAlpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for(int i = 0; i < croAlpha.length; i++){
			if(s.contains(croAlpha[i])){
				s = s.replace(croAlpha[i], "A");
			}
		}

		bw.write(String.valueOf(s.length()));
		bw.flush();
		bw.close();
		br.close();
	}
}
