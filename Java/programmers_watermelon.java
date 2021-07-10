package Java;

public class programmers_watermelon {
    public static void main(String[] args) {
        String answer = "";
        int n = 100;
        for(int i = 0; i < n/2; i++){
                answer +="수박";
            }
        if(n % 2 != 0){
            answer += "수";
        }
        System.out.println(answer);
    }
}
