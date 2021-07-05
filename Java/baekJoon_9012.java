package Java;

import java.io.*;
import java.util.Stack;

public class baekJoon_9012 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		String result = "";

		for(int i = 0; i < repeat; i++){
			Stack<String> vps = new Stack<String>();
			String[] s = br.readLine().split("");
			result = "YES";
			for(int j = 0; j< s.length; j++){
				if(s[j].equals(")") && vps.size() == 0){
					result = "NO";
					break;
				}else if(s[j].equals("(")){
					vps.push(s[j]);
				}else if(s[j].equals(")")){
					if(!vps.peek().equals("(")){
						result = "NO";
						break;
					}else{
						vps.pop();
					}
				}
			}
			if(vps.size() != 0){
				result = "NO";
			}
			bw.write(result+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
