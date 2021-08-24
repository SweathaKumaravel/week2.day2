package week2.day2assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text="Tes12Le79af65";
		int sum=0;
		String text1 =  text.replaceAll("\\D", "");
		char ch[] = text1.toCharArray();
		
		for(int i=0;i<ch.length; i++) {
			sum =sum+ Character.getNumericValue(ch[i]);			
		}
		System.out.println(sum);
	}

}
