public class ForAndArrayTest {

	public static void main (String[] args){

		
		String[] names = new String[]{"Oumarou", "Bilale", "Arouna", "Hiroko"};

		int[] scores = new int[]{80, 65, 70, 95};
		
		/*
		System.out.println(names[0] + "さんの点数:" + scores[0] + "点");
		System.out.println(names[1] + "さんの点数:" + scores[1] + "点");
		System.out.println(names[2] + "さんの点数:" + scores[2] + "点");
		System.out.println(names[3] + "さんの点数:" + scores[3] + "点");
		*/

		//上のコードをfor文を使って書き直す
		for(int i = 0; i < names.length; i++){

			System.out.println(names[i] + "さんの点数:" + scores[i] + "点");
		}			
	}
}