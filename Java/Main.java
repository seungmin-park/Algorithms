package Java;

import java.io.*;

public class Main {
	static int n;
	static int m;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] place = br.readLine().split(" ");
		n = Integer.parseInt(place[1]);
		m = Integer.parseInt(place[0]);
		arr = new int[n+1][m+1];
		for(int i = 1; i <=m ; i++){
			String[] item = br.readLine().split(" ");
			int dX = Integer.parseInt(item[0]);
			int dY = Integer.parseInt(item[1]);
			arr[dX][dY] = 1;
		}

		int cnt = 0;
		for(int i = 0; i <n ; i++){
			for(int j = 0; j < m; j++){
				if(dfs(i,j)){
					cnt++;
				}
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		br.close();
	}
	private static boolean dfs(int x, int y) {
		if(x<= -1 || x >= n || y<= -1 || y>=m){
			return false;
		}

		if(arr[x][y] == 0){
			arr[x][y] = 1;
			dfs(x-1, y);
			dfs(x, y-1);
			dfs(x+1, y);
			dfs(x, y+1);
			return true;
		}

		return false;
	}

}
