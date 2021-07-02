package Java;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class baekJoon_9414 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		int max = 1000000;
		for(int i = 0; i <repeat; i++){
			ArrayList<Integer> arr = new ArrayList<>();
			int sum = 0;
			while(true){
				int temp = Integer.parseInt(br.readLine());
				if(temp == 0){
					Collections.sort(arr);
					Collections.reverse(arr);
					for(int j = 1; j <= arr.size(); j++){
						sum += 2 * Math.pow(arr.get(j-1), j);
					}
					if(sum < max){
						bw.write(String.valueOf(sum)+"\n");
						break;
					}
					else{
						bw.write("Too expensive\n");
						break;
					}
				}
				else{
					arr.add(temp);
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
