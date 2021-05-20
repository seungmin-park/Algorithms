package Java;

import java.io.*;

public class baekJoon_1152 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		int length = 0;
		for(int i=0;i<str.length;i++) {
            String b = str[i];
            if (b.equals("")) {
            }else{
                length+=1;
            }
        }	
		bw.write(String.valueOf(length));
		bw.flush();
		bw.close();
		br.close();
	}
}
