package Java;

import java.io.*;

public class baekJoon_1978 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		String[] num = br.readLine().split(" ");
		int result = 0;
		for(int i = 0; i <repeat; i++){
			int temp = Integer.parseInt(num[i]);
			if(temp == 2){
				result++;
			}
			else if(temp>1){
				for(int j = 2; j< temp; j++){
					if(temp%j == 0){
						break;
					}
					else if(j == temp-1){
						result++;
					}
				}
			}
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
