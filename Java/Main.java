package Java;

import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] countAndRepeat = br.readLine().split(" ");
		BigInteger numA = new BigInteger(countAndRepeat[0]);
		BigInteger numB = new BigInteger(countAndRepeat[1]);

		bw.write(String.valueOf(numA.add(numB)));
		bw.flush();
		bw.close();
		br.close();
	}
}