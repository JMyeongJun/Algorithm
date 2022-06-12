package 한국정보올림피아드.KOI_2019_1차.초등부;

public class Test {
	public static void main(String[] args) {
		System.out.println(solution(112));
	}
	
	public static String solution(int num) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        char[] digits = Integer.toString(num).toCharArray();
        String answer = "";
        for(int i = 0; i < digits.length; i++) {
        	answer += numbers[Character.getNumericValue(digits[i])]; 
        }
        return answer;
    }
}
