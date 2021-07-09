package Java;

import java.io.*;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		int result = 0;
		LinkedList<Integer> jamin = new LinkedList<>();
		for(int i = 0; i < repeat; i++){
			int num = Integer.parseInt(br.readLine());
			if(num != 0){
				jamin.add(num);
			}else{
				jamin.removeLast();
			}
		}
		for(int x : jamin){
			result += x;
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
