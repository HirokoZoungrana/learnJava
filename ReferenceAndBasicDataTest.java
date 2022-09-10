public class ReferenceAndBasicDataTest{

	public static void main(String[] args){

		/*問1 参照型変数の例*/
		int [] a = new int[]{1, 2, 3}; 
		int [] b = a;
		
		b[0] = 5;
		System.out.println(a[2]);

		/*
			配列の宣言の場合、配列を置く場所のアドレスが用意される

			→参照型変数

			int [] b = a;
			この部分では、配列bに配列aのアドレスを渡している

			b[0] = 5;
			ここで配列bの要素を代入すると、連動して配列aも書き換えられる

			要素数[1][2]は上書きされていないので、値はそのまま
		*/


		/*問2　基本データ型変数の例*/
		int c = 1;
		int d = c;
		d = 5;
		System.out.println(c);

		/*
			プリミティブ型の宣言の場合、変数に直接値が入っている

			→基本データ型変数

			対応するbit数を超える値を代入することはできない
		*/
	}
}