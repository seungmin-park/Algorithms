package Java;

import java.io.*;
import java.util.Arrays;


public class baekJoon_1920 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int y = Integer.parseInt(br.readLine());
		String[] q = br.readLine().split(" ");
		int[] xArr = new int[s.length];
		int[] yArr = new int[q.length];
		for(int i = 0; i <x;i++){
			xArr[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(xArr);
		for(int i = 0; i <y; i++){
			yArr[i] = Integer.parseInt(q[i]);
		}
		for(int i = 0; i < y; i++){
			int left = 0;
			int right = xArr.length-1;
			boolean flag = false;
			while(left <= right){
				int midIndex = (right+left)/2;
				int midValue = xArr[midIndex];
				if(yArr[i] < midValue){
					right = midIndex - 1;
				}
				else if(yArr[i] > midValue){
					left = midIndex + 1;
				}
				else{
					bw.write(String.valueOf("1 "));
					flag = true;
					break;
				}
			}
			if(!flag){
				bw.write(String.valueOf("0 "));
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
