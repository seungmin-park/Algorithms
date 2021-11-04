package Java;

import java.io.*;
import java.util.*;

public class baekJoon_11557 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer repeat = Integer.parseInt(br.readLine());
        for (int i = 0; i < repeat; i++){
            Integer repeatValue = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new TreeMap<>();
            for (int j = 0; j < repeatValue; j++){
                String[] value = br.readLine().split(" ");
                map.put(value[0], Integer.parseInt(value[1]));
            }
            List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
            entryList.sort(Map.Entry.comparingByValue());
            int key = entryList.size() - 1;
            bw.write(entryList.get(key).getKey());
			bw.write("\n");
        }


		bw.flush();
		bw.close();
		br.close();
	}
}