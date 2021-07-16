package Java;

import java.io.*;
import java.util.*;

public class baekJoon_1260_List {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		String[] s = br.readLine().split(" ");
		int n  = Integer.parseInt(s[0]);//정점의 개수
		int m  = Integer.parseInt(s[1]);//간선의 개수
		int v  = Integer.parseInt(s[2]);//시작점
		boolean[] vis = new boolean[n+1];//방문 여부
		LinkedList<Integer>[] arr = new LinkedList[n+1];
		for(int i = 0; i <=n; i++){
			arr[i] = new LinkedList<Integer>();
		}
		for(int i = 0; i <m; i ++){
			String[] place = br.readLine().split(" ");
			int x = Integer.parseInt(place[0]);
			int y = Integer.parseInt(place[1]);
			arr[y].add(x);
			arr[x].add(y);
		}

		for(int i = 1; i <=n; i++){
			Collections.sort(arr[i]);
		}
		dfs(v, arr,vis);
		bw.write("\n");
		bfs(v, arr,vis);

		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfs(int v,LinkedList<Integer>[] arr, boolean[] vis) throws IOException{
		vis[v] = true;
		bw.write(String.valueOf(v));
		bw.write(" ");
			Iterator<Integer> iter = arr[v].listIterator();
			while(iter.hasNext()){
				int n = iter.next();
				if(!vis[n]){
					dfs(n, arr, vis);
				}
			}
	}

	public static void bfs(int v,LinkedList<Integer>[] arr,boolean[] vis) throws IOException{
		Queue<Integer> q = new LinkedList<>();
		
		q.add(v);
		vis[v] = false;

		while(!q.isEmpty()){
			v = q.poll();
			bw.write(String.valueOf(v));
			bw.write(" ");
			Iterator<Integer> iter = arr[v].listIterator();
			while(iter.hasNext()){
				int w = iter.next();
				if(vis[w]){
					vis[w] = false;
					q.add(w);
				}
			}
		}
	}
}
