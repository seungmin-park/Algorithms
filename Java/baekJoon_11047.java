package Java;
import java.io.*;
public class baekJoon_11047 {
    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");//동전이 몇종류 인지, 금액 입력
		int[] coinKind = new int[Integer.parseInt(s[0])];//동전 금액 입력
		int result = Integer.parseInt(s[1]);//나눌금액
		int count = 0;
		for(int i = 0; i < coinKind.length; i++){
			coinKind[i] = Integer.parseInt(br.readLine());
		}
		for(int i = coinKind.length; i > 0 ; i--){
			if(result >= coinKind[i-1]){
				count += result/coinKind[i-1];
				result = result%coinKind[i-1];
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
