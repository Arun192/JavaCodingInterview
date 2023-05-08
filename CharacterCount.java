package in.arun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Text : ");
		String input = sc.nextLine();
		String lowerCase = input.replaceAll("\\s","").toLowerCase();
		char[] charArray = lowerCase.toCharArray();

//		Map<Character, Integer> map = new HashMap<>();
//		for (char c : charArray) {
//
//			if (map.containsKey(c)) {
//
//				map.put(c, map.get(c) + 1);
//			} else {
//				map.put(c, 1);
//			}
//		}
//
//		map.forEach((key, value) -> {
//			System.out.println(key + " occured " + value);
//		});
		
		
		//OR
		
		List<char[]> list = Arrays.asList(charArray);
		Map<char[], Long> count = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(count.toString());
	}

}
