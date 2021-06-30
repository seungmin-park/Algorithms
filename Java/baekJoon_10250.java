package Java;

import java.io.*;

public class baekJoon_10250 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int repeat = Integer.parseInt(br.readLine());
		for(int i = 0; i < repeat; i ++){
			String[] s = br.readLine().split(" ");
			int layer = Integer.parseInt(s[2]) % Integer.parseInt(s[0]);
			int wide = Integer.parseInt(s[2]) / Integer.parseInt(s[0]) +1;
			if(layer == 0)//반례 1 1 1
			{
				layer = Integer.parseInt(s[0]);
				wide =Integer.parseInt(s[2]) / Integer.parseInt(s[0]);
			}
			sb.append(layer);
			sb.append(wide < 10 ? "0"+wide : wide);
			bw.write(sb.toString()+"\n");
			sb.setLength(0);
		}
		
        
		bw.flush();
		bw.close();
		br.close();
	}
}