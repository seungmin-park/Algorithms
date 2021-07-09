package Java;

import java.io.*;

class Solution {
    public int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int answer = 0;
        for(int i = 0; i < numbers.length; i++){
            if(s.contains(numbers[i])){
                s = s.replace(numbers[i], String.valueOf(i));
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}

public class kakao_2021_Internship_problems1 {
	public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
		String[] s = {"one4seveneight", "23four5six7", "2three45sixseven", "123"};
		for(int i = 0; i <s.length; i++){
			System.out.println(solution.solution(s[i]));
		}

	}
}
