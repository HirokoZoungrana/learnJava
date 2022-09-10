public class NewReturnTest {

	public static void main (String[] args) {

		int a = 324567;

		System.out.println(isMultipleOf3(a));
	}

	public static String isMultipleOf3 (int num) {
	
		boolean result = (num % 3 == 0);

		String resultMessage = "";

		/*

		return文の書き方①
		if(result) return num + "は3で割り切れます";

		return num + "は3で割り切れません";
		*/

		if(result) resultMessage = num + "は3で割り切れます";

		else resultMessage = num + "は3で割り切れません";

		return resultMessage;

	} 
}