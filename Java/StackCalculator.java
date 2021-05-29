package Java;

import java.io.*;
import java.util.*;

public class StackCalculator {
	static int precedence(char ch) {
        if (ch == '(') return 2;
        if (ch == '+' || ch == '-') return 1;
        else return 0;
    }

	static double cal(String postfix){
		double result = 0;
		Stack<Double> test = new Stack<>();
		for(char token : postfix.toCharArray()){
			if('1' <= token && token <= '9'){
				token -= 48;
				test.push((double)token);
			}
			else{
				if(token == '*'){
					double x = test.pop();
					double y = test.pop();
					result = y* x;
					test.push(result);
				}
				else if(token == '/'){
					double x = test.pop();
					double y = test.pop();
					result = y/x;
					test.push(result);
				}
				else if(token == '-'){
					double x = test.pop();
					double y = test.pop();
					result = y-x;
					test.push(result);
				}
				else if(token == '+'){
					double x = test.pop();
					double y = test.pop();
					result = y+x;
					test.push(result);
				}
			}
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine().replaceAll(" ", "");
		String postfix = "";
		Stack<Character> oper = new Stack<>();
		for(char infix : s.toCharArray()){
			if('1' <= infix && infix <= '9'){
				postfix += infix;
			}
			else if(infix == '('){
				oper.push(infix);
			}
			else if(infix == ')'){
				while(!oper.isEmpty()){
					if(oper.peek() == '('){
						oper.pop();
						break;
					}
					postfix += oper.pop();
				}
			}
			else{
				while(!oper.isEmpty() && precedence(oper.peek()) <= precedence(infix)){
					postfix += oper.pop();
				}
				oper.push(infix);
			}
		}
		while (!oper.isEmpty()) {
            postfix += oper.pop();
        }
		bw.write("전위표기식 -> 후위 표기식 : "+postfix+"\n");
		bw.write("계산 결과 : "+String.valueOf(cal(postfix)));
		bw.flush();
		bw.close();
		br.close();
	}
}