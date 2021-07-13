package Java;

import java.io.*;

public class baekJoon_11034 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true){
			try{
				String[] test = br.readLine().split(" ");
				int left = Integer.parseInt(test[0]);
				int mid = Integer.parseInt(test[1]);
				int right = Integer.parseInt(test[2]);
				int leftLength = mid - left;
				int rightLength = right - mid;
				if(rightLength > leftLength){
					bw.write(String.valueOf(rightLength - 1));
					bw.write("\n");
				}else{
					bw.write(String.valueOf(leftLength - 1));
					bw.write("\n");
				}
			}
			catch(Exception ex){
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
