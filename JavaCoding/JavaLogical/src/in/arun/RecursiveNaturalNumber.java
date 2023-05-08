package in.arun;

public class RecursiveNaturalNumber {
	
	public static void main(String[] args) {
		int num =1;
		natural(num);
	}

	static void natural(int num) {
		
		if (num <= 10) {
			System.out.println("Natural Number : "+num);
			natural(++num);

		}
		
	}

}
