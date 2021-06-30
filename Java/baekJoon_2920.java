package Java;

import java.io.*;

public class baekJoon_2920 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		
		String result = "";//출력결과
		if(s[0].equals("1")){
			result = "ascending";
			for(int i = 0; i < s.length-1; i++){
				int temp = Integer.parseInt(s[i]);
				if(temp + 1 != Integer.parseInt(s[i+1])){
					result="mixed";
					break;
				}
			}
		}
		else if(s[0].equals("8")){
			result = "descending";
			for(int i = 0; i < s.length-1; i++){
				int temp = Integer.parseInt(s[i]);
				if((temp - 1) != Integer.parseInt(s[i+1])){
					result="mixed";
					break;
				}
			}
		}
		else{
			result = "mixed";
		}
		
		bw.write(result);

		bw.flush();
		bw.close();
		br.close();
	}
}