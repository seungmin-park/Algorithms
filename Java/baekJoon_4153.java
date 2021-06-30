package Java;

import java.io.*;
import java.util.Arrays;

public class baekJoon_4153 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s;
		int[] arr = new int[3];
		String result = "";
		while(true){
			s = br.readLine().split(" ");
			for(int i = 0; i < s.length; i++){
				arr[i] = (Integer.parseInt(s[i]));
			}
			Arrays.sort(arr);
			if(s[0].equals("0") &&s[1].equals("0") &&s[2].equals("0")){
				break;
			}
			else if(Math.pow(arr[2], 2) == Math.pow(arr[1], 2)+ Math.pow(arr[0], 2)){
				result = "right";
			}
			else{
				result = "wrong";
			}
			bw.write(result+"\n");
		}
        
		bw.flush();
		bw.close();
		br.close();
	}
}