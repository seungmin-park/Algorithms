package Java;

import java.io.*;

public class baekJoon_2720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < repeat; i++){
			int quarter = 0;//$0.25
			int dime = 0;//$0.10
			int nickel = 0;// $0.05
			int Penny = 0;// $0.01
			int money = Integer.parseInt(br.readLine());
			quarter = money/25;
			money %= 25;
			dime = money/10;
			money %= 10;
			nickel = money/5;
			money %= 5;
			Penny = money/1;
			money %= 1;
			bw.write(String.valueOf(quarter));
			bw.write(" ");
			bw.write(String.valueOf(dime));
			bw.write(" ");
			bw.write(String.valueOf(nickel));
			bw.write(" ");
			bw.write(String.valueOf(Penny));
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
