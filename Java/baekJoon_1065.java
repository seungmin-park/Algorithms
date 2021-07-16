package Java;

import java.io.*;

public class baekJoon_1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		if(num< 100){
			count = num;
		}else{
			count = 99;
			if(num == 1000){
				num = 999;
			}
			for(int i = 100; i <=num; i++){
				int hundred = i/100;
				int ten = i%100/10;
				int one = i%10;
				if((hundred-ten) == (ten- one)){
					count++;
				}
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
