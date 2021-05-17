package Java;

import java.io.*;
import java.util.*;

public class baekJoon_2750 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		int[] Arr = new int[x];
        for(int i = 0; i < x; i++){
			Arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(Arr);
		
		for(int i : Arr){
			bw.write(String.valueOf(i)+"\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}