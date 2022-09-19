package 이것이_코딩_테스트다.다익스트라;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 예제 {
    static class Node implements Comparable<Node> {
        public int vertex, weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static ArrayList<Node>[] graph;
    static int[] distance;
    static boolean[] visit;
    static int N, M, K;

    static void init() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visit = new boolean[N + 1];
        distance = new int[N + 1];

        for (int i = 2; i <= N; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        K = Integer.parseInt(br.readLine());

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            graph[v].add(new Node(e, r));
        }
    }

    static void process() {
        dijkstra(K);
        for (int i = 1; i <= N; i++) {
            System.out.println(distance[i]);
        }

        System.out.println(sb.toString());
    }

    static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node currnetNode = pq.poll();
            int vertex = currnetNode.vertex;
            if (visit[vertex])
                continue;
            for (Node node : graph[vertex]) {
                distance[node.vertex] = Math.min(distance[node.vertex], distance[vertex] + node.weight);
                pq.add(node);
            }
            visit[vertex] = true;
        }
    }

    public static void main(String[] args) throws IOException {
        init();
        process();
    }
}
