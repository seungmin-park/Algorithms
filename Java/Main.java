package Java;

import java.io.*;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] buggerPrice = new int[3];
		int[] drinkPrice = new int[2];
        for(int i = 0; i < 3; i++){
			buggerPrice[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < 2; i++){
			drinkPrice[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(buggerPrice);
		Arrays.sort(drinkPrice);
        bw.write(String.valueOf(buggerPrice[0]+drinkPrice[0]-50));     

		bw.flush();
		bw.close();
		br.close();
	}
}