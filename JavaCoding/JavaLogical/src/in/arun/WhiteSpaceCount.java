package in.arun;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		
		String str = "Arkur ksffh hrkfh ksshfh lihfif iwi elielihr sjr";
		
		int count =0;
		char ch;
		for (int i = 0; i < str.length(); i++) {
			
			ch = str.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
