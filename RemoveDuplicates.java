package week2.day2assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] strArry = text.split(" ");
		
		for (int i = 0; i < strArry.length; i++) {
			int count = 0;
			for (int j = 0; j < strArry.length; j++) {
				if (strArry[i].equals(strArry[j])) 
				{
					count = count + 1;
				}
			}
			if (count > 1) {
				strArry[i]=strArry[i].replace(strArry[i], "");
			}

		}

		for (int l = 0; l < strArry.length; l++) {
			System.out.print(strArry[l] + " ");

	}

}
}