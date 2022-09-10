public class NewGreeting{

	public static void main (String[] args){

		int time = 10;

		String message = "ただ今の時刻は" + time + "時です！";
		String greeting = "";

		if((time >= 4) && (time <= 10)){
			greeting = "おはようございます！";
		}

		else if((time >= 11) && (time <= 17)){
			greeting = "こんにちは！";
		}

		else if(time == 18){
			greeting = "こんばんは！";
		}

		else if((time >= 18 && time <= 24) || (time <= 3 && time >= 0)){
			greeting = "おやすみなさい";
		}

		else{
			message = "timeには0~24の値を入力してください";
		}

		System.out.println(message);
		System.out.println(greeting);
	}
}