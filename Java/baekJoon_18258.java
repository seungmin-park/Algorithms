package Java;

import java.io.*;
import java.util.LinkedList;

public class baekJoon_18258 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i = 0; i < repeat; i++){
			String[] method = br.readLine().split(" ");
			if(method[0].equals("push")){
				queue.add(Integer.parseInt(method[1]));
			}else if(method[0].equals("pop")){
				if(queue.size() == 0){
					bw.write("-1\n");
				}else{
					bw.write(String.valueOf(queue.get(0)));
					bw.write("\n");
					queue.remove(0);
				}
			}
			else if(method[0].equals("size")){
				bw.write(String.valueOf(queue.size()));
				bw.write("\n");
			}
			else if(method[0].equals("empty")){
				if(queue.size() == 0){
					bw.write("1\n");
				}else{
					bw.write("0\n");
				}
			}
			else if(method[0].equals("front")){
				if(queue.size() == 0){
					bw.write("-1\n");
				}else{
					bw.write(String.valueOf(queue.get(0)));
					bw.write("\n");
				}
			}
			else if(method[0].equals("back")){
				if(queue.size() == 0){
					bw.write("-1\n");
				}else{
					bw.write(String.valueOf(queue.get(queue.size()-1)));
					bw.write("\n");
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
