package Java;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int length = s.length;
		if(s[0].equals("")){
			length = 0;
		}	
		bw.write(String.valueOf(length));
		bw.flush();
		bw.close();
		br.close();
	}
}
