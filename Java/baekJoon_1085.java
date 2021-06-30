package Java;

import java.io.*;

public class baekJoon_1085 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        String[] s = br.readLine().split(" ");
		int x = Integer.parseInt(s[0]);
		int y = Integer.parseInt(s[1]);
		int w = Integer.parseInt(s[2]);
		int h = Integer.parseInt(s[3]);
		int min = 1001;
		int[] leng = new int[4];
		leng[0] = x;
		leng[1] = y;
		leng[2] = w-x;
		leng[3] = h-y;
		for(int i = 0; i < leng.length; i++){
			if(min>leng[i]){
				min = leng[i];
			}
		}
	

		bw.write(String.valueOf(min));
		bw.flush();
		bw.close();
		br.close();
	}
}