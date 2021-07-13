package Java;

import java.io.*;

public class baekJoon_1924 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] date = br.readLine().split(" ");
		int month = Integer.parseInt(date[0]);
		int day = Integer.parseInt(date[1]);
		int result = 0;
		int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i = 0; i <month;i++){
			result += arr[i];
		}
		switch((result+day)%7){
			case 1:
				bw.write("MON");
				break;
			case 2:
				bw.write("TUE");
				break;
			case 3:
				bw.write("WED");
				break;
			case 4:
				bw.write("THU");
				break;
			case 5:
				bw.write("FRI");
				break;
			case 6:
				bw.write("SAT");
				break;
			case 0:
				bw.write("SUN");
				break;
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
