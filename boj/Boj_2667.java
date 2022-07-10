package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Boj_2667 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
    static String[] a;
    static boolean[][] visit;
    static ArrayList<Integer> group;
    static int N, group_cnt;

    static void init() throws IOException {
        N = Integer.parseInt(br.readLine());
        a = new String[N];

        for (int i = 0; i < N; i++) {
            a[i] = br.readLine();
        }

        visit = new boolean[N][N];
    }

    static void process() {
        group = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j] && a[i].charAt(j) == '1') {
                    group_cnt = 0;
                    dfs(i, j);
                    group.add(group_cnt);
                }
            }
        }

        Collections.sort(group);
        sb.append(group.size()).append("\n");
        for (int cnt : group) {
            sb.append(cnt).append("\n");
        }

        System.out.println(sb.toString());
    }

    static void dfs(int x, int y) {
        visit[x][y] = true;
        group_cnt++;
        for (int i = 0; i < 4; i++) {
            int nx = x - dir[i][0];
            int ny = y - dir[i][1];
            if (nx < 0 || ny < 0 || ny >= N || nx >= N)
                continue;
            if (a[nx].charAt(ny) == '0')
                continue;
            if (visit[nx][ny])
                continue;
            dfs(nx, ny);
        }
    }

    public static void main(String[] args) throws IOException {
        init();
        process();
    }
}
