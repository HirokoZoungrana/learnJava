
public class ForInFor {

	public static void main (String[] args) {

		/*
		for(int i = 1; i <= 9; i++) {
			
			String a = "";

			for(int j = 1; j <= 9; j++) {
				
				a += i * j + " ";
			}
			
			System.out.println(a);
		}
		*/


		//String a　の宣言がfor文の外に置かれていることで、うまく動作しない例

		//スコープを外れると、変数は存在できない

		String a = "";

		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
				
				a += i * j + " ";
			}
			
			System.out.println(a);
		}
		
	}
}