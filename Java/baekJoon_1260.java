package Java;

import java.io.*;
import java.util.*;

public class baekJoon_1260 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		String[] s = br.readLine().split(" ");
		int n  = Integer.parseInt(s[0]);//정점의 개수
		int m  = Integer.parseInt(s[1]);//간선의 개수
		int v  = Integer.parseInt(s[2]);//시작점
		int[][] arr = new int[n+1][n+1];
		for(int i = 0; i <m; i ++){
			String[] place = br.readLine().split(" ");
			int x = Integer.parseInt(place[0]);
			int y = Integer.parseInt(place[1]);
			arr[x][y] = 1;
			arr[y][x] = 1;
		}

		dfs(v, arr);
		bw.write("\n");
		bfs(v, arr);

		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfs(int v,int[][] arr) throws IOException{
		Stack<Integer> s = new Stack<>();
		int n = arr.length-1;
		boolean[] vis = new boolean[n+1];//방문 여부
		s.push(v);
		vis[v] = true;
		bw.write(String.valueOf(v));
		bw.write(" ");
		boolean flag;
		while(!s.isEmpty()){
			int w = s.peek();
			flag = false;
			for(int i = 1; i <=n;i++){
				if(arr[w][i] == 1 && !vis[i]){
					s.push(i);
					bw.write(String.valueOf(i));
					bw.write(" ");
					vis[i] = true;
					flag = true;

					break;
				}
			}
			if(!flag){
				s.pop();
			}
		}
	}

	public static void bfs(int v,int[][] arr) throws IOException{
		Queue<Integer> q = new LinkedList<>();
		int n = arr.length-1;
		boolean[] vis = new boolean[n+1];//방문 여부
		q.add(v);
		vis[v] = true;

		while(!q.isEmpty()){
			v = q.poll();
			bw.write(String.valueOf(v));
			bw.write(" ");
			for(int i = 1; i <=n;i++){
				if(arr[v][i] == 1 && !vis[i]){
					q.add(i);
					vis[i] = true;
				}
			}
		}
	}
}
