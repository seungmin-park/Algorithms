package Java;

import java.io.*;

public class baekJoon_1012 {
	static int n;
	static int m;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		for(int k = 0; k <repeat; k++){
			String[] place = br.readLine().split(" ");
			n = Integer.parseInt(place[0]);
			m = Integer.parseInt(place[1]);
			int cnt = Integer.parseInt(place[2]);
			arr = new int[n][m];
			for(int i = 0; i < cnt; i ++){
				String[] item = br.readLine().split(" ");
				int aX = Integer.parseInt(item[0]);
				int aY = Integer.parseInt(item[1]);
				arr[aX][aY] = 1;
			}
			int result = 0;
			for(int i = 0; i <n ; i++){
				for(int j = 0; j < m; j++){
					if(dfs(i,j)){
						result++;
					}
				}
			}
			bw.write(String.valueOf(result));
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	private static boolean dfs(int x, int y) {
		if(x<= -1 || x >= n || y<= -1 || y>=m){
			return false;
		}

		if(arr[x][y] == 1){
			arr[x][y] = 0;
			dfs(x-1, y);
			dfs(x, y-1);
			dfs(x+1, y);
			dfs(x, y+1);
			return true;
		}

		return false;
	}

}
