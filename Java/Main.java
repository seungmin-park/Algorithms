package Java;

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		int[] numbers = new int[repeat];
		int sum = 0;
		for(int i = 0; i< repeat; i++){
			numbers[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(numbers);

		for(int x : numbers){
			sum += x;
		}
		bw.write(String.valueOf(sum/repeat));
		bw.write("\n");
		bw.write(String.valueOf((numbers[repeat/2])));
		bw.write("\n");
		bw.write("\n");
		bw.write(String.valueOf(numbers[repeat-1] -numbers[0]));
		bw.flush();
		bw.close();
		br.close();
	}
}
