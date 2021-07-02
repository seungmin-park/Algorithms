package Java;

import java.io.*;

public class baekJoon_2798 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int[] numbers = new int[Integer.parseInt(s[0])];
		String[] n = br.readLine().split(" ");
		int max = Integer.parseInt(s[1]);
		int result = 0; 

		for(int i = 0; i < numbers.length; i++){
			numbers[i] = Integer.parseInt(n[i]);
		}
		
		for(int i = 0; i <numbers.length-2; i++){
			for(int j = i+1; j< numbers.length-1; j++){
				for(int k = i+2; k <numbers.length; k++){
					int temp = numbers[i] + numbers[j] + numbers[k];
					if(j != k && temp <= max && result < temp){
						result = temp;
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
