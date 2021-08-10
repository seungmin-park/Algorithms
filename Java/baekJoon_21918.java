package Java;

import java.io.*;

public class baekJoon_21918 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] countAndRepeat = br.readLine().split(" ");
		int repeat = Integer.parseInt(countAndRepeat[1]);
		String[] status = br.readLine().split(" ");
		for(int i = 0; i < repeat; i ++){
			String[] command = br.readLine().split(" ");
			if(command[0].equals("1")){
				status[Integer.parseInt(command[1]) -1] = command[2];
			}else if(command[0].equals("2")){
				for(int j = Integer.parseInt(command[1]) - 1; j <= Integer.parseInt(command[2]) -1 ; j ++){
					if(status[j].equals("1")){
						status[j] = "0";
					}else{
						status[j] = "1";
					}
				}
			}
			else if(command[0].equals("3")){
				for(int j = Integer.parseInt(command[1]) - 1; j <= Integer.parseInt(command[2]) -1 ; j ++){
					status[j] = "0";
					
				}
			}
			else if(command[0].equals("4")){
				for(int j = Integer.parseInt(command[1]) - 1; j <= Integer.parseInt(command[2]) -1 ; j ++){
					status[j] = "1";
					
				}
			}
		}
		for(String x : status){
			bw.write(x);
			bw.write(" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}