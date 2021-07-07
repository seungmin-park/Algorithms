package Java;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		ArrayList<String> s= new ArrayList<>();
		for(int i = 0; i < repeat; i++){
			String item = br.readLine();
			if(!s.contains(item)){
				s.add(item);
			}
		}
		
		Collections.sort(s,new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				// 그 외의 경우 
				else {
					return s1.length() - s2.length();
				}
			}
		});

		for(String words : s){
			bw.write(words);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
