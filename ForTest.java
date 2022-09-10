
public class ForTest{

	public static void main(String[] args){

		int n = 31;
		int answer = 1;

		for(int i = 0; i < n; i++) {

			answer *= 2;
		}

		System.out.println("2の" + n + "乗は、" + answer);

		/*
		

		answer はint型なので、代入できるのは4byte（32bitまで）
		2,147,483,647（およそ21億5千万）

		今回のクラスの例では、「2の30乗まで」

		
		C:\Users\user\Java>java ForTest
		2の30乗は、1073741824

		C:\Users\user\Java>java ForTest
		2の31乗は、-2147483648

		C:\Users\user\Java>java ForTest
		2の32乗は、0
		*/
	}
}