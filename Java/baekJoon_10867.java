package Java;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class baekJoon_10867 {
public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		String[] n = br.readLine().split(" ");
		ArrayList<Integer> nums = new ArrayList<>();
		for(String s : n){
			int temp = Integer.parseInt(s);
			if(!nums.contains(temp)){
				nums.add(temp);
			}
		}
		Collections.sort(nums);
		for(Integer s : nums){
			bw.write(String.valueOf(s));
			bw.write(" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}