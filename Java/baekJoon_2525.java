package Java;

import java.io.*;

public class baekJoon_2525 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] time = br.readLine().split(" ");
		int hour = Integer.parseInt(time[0]);
		int minute = Integer.parseInt(time[1]);
		int take = Integer.parseInt(br.readLine());
		int x = take/60;
		int y = take%60;
		hour += x;
		minute += y;
		if(minute >=60){
			hour += minute/60;
			minute %= 60;
		}
		if(hour >= 24){
			hour -= 24;
		}
		bw.write(String.valueOf(hour));
		bw.write(" ");
		bw.write(String.valueOf(minute));
		bw.flush();
		bw.close();
		br.close();
	}
}