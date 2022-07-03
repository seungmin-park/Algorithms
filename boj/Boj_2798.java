package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2798 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int goalNumber;
    static int[] N;
    static int NSize;

    static void init() throws IOException {
        st = new StringTokenizer(br.readLine());
        NSize = Integer.parseInt(st.nextToken());
        goalNumber = Integer.parseInt(st.nextToken());

        N = new int[NSize + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= NSize; i++) {
            N[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void process() {

        int result = 0;
        for (int i = 1; i <= NSize - 2; i++) {
            for (int j = i + 1; j <= NSize - 1; j++) {
                for (int k = j + 1; k <= NSize; k++) {
                    int temp = N[i] + N[j] + N[k];
                    if (temp >= result && goalNumber >= temp) {
                        result = temp;
                    }
                }
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        init();
        process();
    }
}
