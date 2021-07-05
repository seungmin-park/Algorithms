package Java;

import java.io.*;
import java.util.LinkedList;

public class baekJoon_10845 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		LinkedList<Integer> deque = new LinkedList<Integer>();
		for(int i = 0; i < repeat; i++){
			String[] method = br.readLine().split(" ");
			if(method[0].equals("push_back")){
				deque.add(Integer.parseInt(method[1]));
			}else if(method[0].equals("push_front")){
				deque.add(0,Integer.parseInt(method[1]));
			}
			else if(method[0].equals("pop_front")){
				if(deque.size() == 0){
					bw.write("-1\n");
				}else{
					bw.write(String.valueOf(deque.get(0)));
					bw.write("\n");
					deque.remove(0);
				}
			}else if(method[0].equals("pop_back")){
				if(deque.size() == 0){
					bw.write("-1\n");
				}else{
					bw.write(String.valueOf(deque.get(deque.size()-1)));
					bw.write("\n");
					deque.remove(deque.size()-1);
				}
			}
			else if(method[0].equals("size")){
				bw.write(String.valueOf(deque.size()));
				bw.write("\n");
			}
			else if(method[0].equals("empty")){
				if(deque.size() == 0){
					bw.write("1\n");
				}else{
					bw.write("0\n");
				}
			}
			else if(method[0].equals("front")){
				if(deque.size() == 0){
					bw.write("-1\n");
				}else{
					bw.write(String.valueOf(deque.get(0)));
					bw.write("\n");
				}
			}
			else if(method[0].equals("back")){
				if(deque.size() == 0){
					bw.write("-1\n");
				}else{
					bw.write(String.valueOf(deque.get(deque.size()-1)));
					bw.write("\n");
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
