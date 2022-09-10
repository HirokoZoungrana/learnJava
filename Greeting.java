public class Greeting {
	
	public static void main (String[] args) {
	
		int time = 25;

		if(time >= 4 && time <= 10){
			System.out.println("ただ今の時刻は"+time+"時です");
	 		System.out.println("おはようございます!");
		}

		else if(time >= 11 && time <= 17){
			System.out.println("ただ今の時刻は"+time+"時です");
			System.out.println("こんにちは!");
		}

		else if(time == 18){
			System.out.println("ただ今の時刻は"+time+"時です");
			System.out.println("こんばんは!");
		}

		else if((time >= 19 && time <= 24) || (time >= 0 && time <= 3)){
			System.out.println("ただ今の時刻は"+time+"時です");
			System.out.println("おやすみなさい!");
		}
		
		/*
		if(time >= 0 && time <= 3){
			System.out.println("ただ今の時刻は"+time+"時です");
			System.out.println("おやすみなさい!");
		}
		*/

		else if(time > 24 || time < 0){
			System.out.println("今の時間を入力してください!（0~24）");

		}

	
	}
}