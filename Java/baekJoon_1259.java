package Java;

import java.io.*;

public class baekJoon_1259 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String result;
		String front;
		String back;
		while(true){
			result = "yes";
			String s = br.readLine();
			if(s.equals("0")){
				break;
			}
			else if(s.length()%2 != 0){
				front = s.substring(0,s.length()/2);
				back = s.substring(s.length()/2+1,s.length());
			}
			else{
				front = s.substring(0,s.length()/2);
				back = s.substring(s.length()/2,s.length());
			}
			for(int i = 0; i < front.length(); i++){
				if(front.charAt(i) != back.charAt(front.length()-1-i)){
					result = "no";
					break;
				}
			}
			bw.write(result+"\n");
		}
        
		bw.flush();
		bw.close();
		br.close();
	}
}