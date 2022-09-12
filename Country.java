
public class Country {

	//インスタンスに関連づいていないstaticな変数をクラスに加える
	static int count_Country = 0;
	//インスタンスに紐づいているのではなく、クラスに紐づいている＝クラス固有
	String area;
	String countryName;
	int person;
	
	Country(String area, String countryName, int person){
		this.area = area;
		this.countryName = countryName;
		this.person = person; 
		
		//コンストラクタが呼ばれるたびにcountの値を増やす
		count_Country++;
	}
	
	Country(String area, String countryName){
		this(area, countryName, 100);
	}
/*	
	Country(String area){
		this(area);
	}
	
	Country(){
		this("No Name");
	}
*/
}
