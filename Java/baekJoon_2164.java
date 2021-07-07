package Java;

import java.io.*;
import java.util.LinkedList;


public class baekJoon_2164 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int number = Integer.parseInt(br.readLine());
		LinkedList<Integer> deque = new LinkedList<>();
		for(int i = number; i >0; i--){
			deque.add(i);
		}
		
		while(deque.size() != 1){
			deque.removeLast();
			int temp = deque.getLast();
			deque.removeLast();
			deque.addFirst(temp);
		}
		int result = deque.getFirst();
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
