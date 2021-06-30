package Java;

import java.io.*;

public class baekJoon_2441 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++){
			for(int o=0;i>o;++o) {
				bw.write(" ");
			}
			for(int j=num-i;j>0;--j) {
				bw.write("*");			
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
