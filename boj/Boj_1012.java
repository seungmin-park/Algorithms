package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj_1012 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
    static boolean[][] visit;
    static int[][] a;
    static int T, M, N, K, cnt;
    static ArrayList<Integer> group;
    static int group_cnt;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        a = new int[N][M];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            a[y][x] = 1;
        }
    }

    static void process() {
        visit = new boolean[N][M];
        group = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (a[i][j] == 0)
                    continue;
                if (visit[i][j])
                    continue;
                group_cnt = 0;
                dfs(j, i);
                group.add(group_cnt);
            }
        }
        System.out.println(group.size());
        cnt = 0;
    }

    static void dfs(int x, int y) {
        visit[y][x] = true;
        group_cnt++;
        for (int i = 0; i < 4; i++) {
            int nx = x - dir[i][0];
            int ny = y - dir[i][1];

            if (nx < 0 || ny < 0 || nx >= M || ny >= N)
                continue;
            if (visit[ny][nx])
                continue;
            if (a[ny][nx] == 0)
                continue;
            dfs(nx, ny);
        }
    }

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            input();
            process();
        }
    }
}
