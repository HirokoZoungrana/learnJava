public class CalcuTest {

	public static void main (String[] args) {

		twice(15);
		twice(89);
		twice(3247);	
		//メソッドを呼び出す際に実際に渡される値　==　実引数

		powerOfTwo(9);
		powerOfTwo(11);
	}

	public static void twice (int n) { 	/*n は仮引数*/

		System.out.print(n + "の2倍は、");
		System.out.println(n * 2);

	}

	public static void powerOfTwo (int n) {

		int answer = 1;

		for(int i = 0; i < n; i++){
			
			answer *= 2;
		}

		System.out.print("2の" + n + "乗は、");
		System.out.println(answer);

	}
}