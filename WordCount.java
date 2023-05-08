package in.arun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {
		
		String str ="Arun Kumar Prajapati Arun Prajapati Kumar".toLowerCase();
		String[] input = str.split("\\s+");
		
		//Map<String, Integer> map = new HashMap<>();
		
//		for (String string : input) {
//			
//			if (map.containsKey(string)) {
//				
//				map.put(string, map.get(string)+1);
//				
//				
//			}else {
//				map.put(string, 1);
//				
//			}
//			
//		}
//		map.forEach((key,value)->{
//			System.out.println(key +" occured "+value);
//			
//		});
		
		//OR
		
		List<String> list = Arrays.asList(input);
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
	}
}
