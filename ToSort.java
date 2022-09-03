package assigmet;

import java.util.Arrays;
import java.util.List;

public class ToSort {
	
	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(11, 33, 14, 9, 78);
	List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

	System.out.println(list);
	System.out.println(sortedList);
	}
}
