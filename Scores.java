public class Scores{
	
	public static void main(String[] args){

		//int [] scores;
		//int scores[];
		//配列の宣言、プリミティブ型を宣言した後、[]をつけ、その後ろが配列名
		
		//scores = new int[4];
		//配列の要素数の宣言

		//new は演算子の一種。

		//配列の宣言は、つなげてもよい。
		//int[] scores = new int[4];

		/*
		  配列の要素の代入①（宣言の自伝では0が代入されている）
			scores[0] = 80;
			scores[1] = 65;
			scores[2] = 70;
			scores[3] = 95;

		  配列の要素の代入②
			int[] scores;
			scores = new int[]{80, 65, 70, 95};

		　配列の要素の代入③
			int[] scores;
			scores = {80, 65, 70, 95};
		*/

		int[] scores = new int[]{80, 65, 70, 95};

		System.out.println("Aさんの点数:" + scores[0] + "点");

	}
}