package Java;

import java.io.*;
import java.util.*;

public class baekJoon_21756 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		ArrayList<Integer> number = new ArrayList<>();
		for(int i = 1; i <= x; i ++){
			number.add(i);
		}
		while(true){
			int temp = number.size();
			if(number.size() == 1){
				break;
			}
			for(int i = temp-1; i >= 0;i-- ){
				if(i%2 == 0){
					number.remove(i);
				}
			}
		}
		bw.write(String.valueOf(number.get(0)));
		bw.flush();
		bw.close();
		br.close();
	}
}
