package Java;

import java.io.*;

public class baekJoon_21866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int[] score = new int[s.length];
		int[] maxScore  = {100, 100, 200, 200, 300, 300, 400, 400, 500};
		int sum = 0;
		for(int i = 0; i < score.length; i++){
			score[i] = Integer.parseInt(s[i]);
			sum += score[i];
			if(score[i] > maxScore[i]){
				System.out.println("hacker");
				return;
			}
		}
		if(sum < 100){
			bw.write("none");
		}
		else{
			bw.write("draw");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
