package Java;

import java.math.BigInteger;
import java.util.*;

public class baekJoon_1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split(" ");

		BigInteger money = new BigInteger(input[0]);
		BigInteger people = new BigInteger(input[1]);

		//BigInteger 의 연산
		System.out.println(money.divide(people));
		System.out.println(money.mod(people));

		sc.close();
	}	
}