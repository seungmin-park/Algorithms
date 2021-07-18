package Java;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class baekJoon_1406 {
	static int n;
	static int m;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String words = br.readLine();
		LinkedList<Character> editor = new LinkedList<>();
		for(int i = 0; i < words.length(); i ++){
			editor.add(words.charAt(i));
		}
		ListIterator<Character> iter = editor.listIterator();
		int repeat = Integer.parseInt(br.readLine());
		while(iter.hasNext()) {
			iter.next();
		}
		for(int i = 0; i < repeat; i ++){
			String command = br.readLine();
			if(command.charAt(0) == 'L'){
				if(iter.hasPrevious()){
					iter.previous();
				}
			}else if(command.charAt(0) == 'D'){
				if(iter.hasNext()){
					iter.next();
				}
			}
			else if(command.charAt(0) == 'B'){
				if(iter.hasPrevious()){
					iter.previous();
					iter.remove();
				}
			}
			else if(command.charAt(0) == 'P'){
				iter.add(command.charAt(2));
			}
		}
		for(char s : editor){
			bw.write(s);
		}
		bw.flush();
		bw.close();
		br.close();
	}
}