
public class EqualsTest {

	public boolean equals (Object anObject) {

		//Stringはクラス型変数。オブジェクトの位置を示す参照値が代入されている

		String s = "あいうえお";
		String t = "あいうえお";


		boolean b = s.equals(t);
		/*
			equalsメソッドはもともとObjectクラスで定義されている
			それをStringでオーバーライドしている状態

			この式を評価する際、引数に渡した文字列の中身によって
			boolean値を返す

			
			参考：Objectクラスについて
			https://qiita.com/suema0331/items/d3488675e985e2e75a92
		*/



		boolean b = (s == t);	//①
		/*
			この式を評価する際、trueが返される。

			先に作ってあるオブジェクトを自動的に再利用し
			先に作られたオブジェクトの参照値が代入される
		*/

		
		String s = "あいうえお";
		String t = s;

		boolean b = (s == t);	//②
		/*
			この式でも、trueが返される。
			
			String tに sの参照値を代入している
		*/

		return b;
	}

	
}