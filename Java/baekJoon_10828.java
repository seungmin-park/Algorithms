package Java;

import java.io.*;
import java.util.*;

public class baekJoon_10828 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());//반복횟수
		ArrayList<Integer> stack = new ArrayList<>();//스택저장
		for(int i = 0; i < x; i ++){
			String[] s = br.readLine().split(" ");
			//push X : X를 스택에 넣기
			if(s[0].equals("push")){
				stack.add(Integer.parseInt(s[1]));
			}
			//스택 가장 위에 있는 값 출력 후 제거
			else if(s[0].equals("pop")){
				if(stack.size() == 0){
					bw.write(String.valueOf(-1)+"\n");
				}
				else{
					bw.write(String.valueOf(stack.get(stack.size()-1))+"\n");
					stack.remove(stack.size()-1);
				}
			}
			//스택의 길이 출력
			else if(s[0].equals("size")){
				bw.write(String.valueOf(stack.size())+"\n");
			}
			//스택이 비어있는지 여부
			else if(s[0].equals("empty")){
				if(stack.size() == 0){
					bw.write(String.valueOf(1)+"\n");
				}
				else{
					bw.write(String.valueOf(0)+"\n");
				}
			}
			//스택의 가장 위에 값 출력 삭제X
			else if(s[0].equals("top")){
				if(stack.size() == 0){
					bw.write(String.valueOf(-1)+"\n");
				}
				else{
					bw.write(String.valueOf(stack.get(stack.size()-1))+"\n");
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
