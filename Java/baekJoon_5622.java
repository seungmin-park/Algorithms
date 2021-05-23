package Java;

import java.io.*;

public class baekJoon_5622 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split("");
		int sum = 0;
		for(int i = 0; i <s.length; i ++){
			if(s[i].equals("A")||s[i].equals("B")||s[i].equals("C")){
				sum += 3;//2
			}
			else if(s[i].equals("D")||s[i].equals("E")||s[i].equals("F")){
				sum += 4;//3
			}
			else if(s[i].equals("G")||s[i].equals("H")||s[i].equals("I")){
				sum += 5;//4
			}
			else if(s[i].equals("J")||s[i].equals("K")||s[i].equals("L")){
				sum += 6;//5
			}
			else if(s[i].equals("M")||s[i].equals("N")||s[i].equals("O")){
				sum += 7;//6
			}
			else if(s[i].equals("P")||s[i].equals("Q")||s[i].equals("R")||s[i].equals("S")){
				sum += 8;//7
			}
			else if(s[i].equals("T")||s[i].equals("U")||s[i].equals("V")){
				sum += 9;//8
			}
			else if(s[i].equals("W")||s[i].equals("X")||s[i].equals("Y")||s[i].equals("Z")){
				sum += 10;//9
			}
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}
