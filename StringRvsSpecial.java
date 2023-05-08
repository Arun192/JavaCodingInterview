package in.arun;

public class StringRvsSpecial {

	public static void main(String[] args) {

		String str = "asd#sgd$sdv";

		char[] array = str.toCharArray();
		int i = 0;
		int j = array.length - 1;

		while (i < j) {

			if (!Character.isAlphabetic(array[i])) {
				i++;
			} else if (!Character.isAlphabetic(array[j])) {
				j--;
			} else {
				char temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(new String(array));

	}
}