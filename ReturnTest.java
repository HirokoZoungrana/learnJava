public class ReturnTest {

	public static void main (String[] args) {

		int a = 324561;

		if(isMultipleOf3(a)) {
			System.out.println(a + "は3で割り切れます");
		}

		else {
			System.out.println(a + "は3で割り切れません");
		}
	}

	public static boolean isMultipleOf3 (int num) {
	
		boolean result = (num % 3 == 0);

		return result;
	} 
}