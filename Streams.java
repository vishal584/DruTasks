package assigmet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Hyerabad");
		cityList.add("banglore");
		cityList.add("chennai");
		cityList.add("mumbai");
		cityList.add("delhi");
		cityList.add("chicago");
		

		List<String> uppercase = cityList.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercase);
		List<String> length = cityList.stream().filter(a -> a.length()>6).collect(Collectors.toList());
		System.out.println(length);
		List<String> startswith = cityList.stream().filter(a -> a.startsWith("c")).collect(Collectors.toList());
		System.out.println(startswith);
		List<String> contain = cityList.stream().filter(a -> a.contains("ai")).collect(Collectors.toList());
		System.out.println(contain);
		List<String> append = cityList.stream().map(a -> a.concat("metro")).collect(Collectors.toList());
		System.out.println(append);
		List<String> sortedList = cityList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		long count = cityList.stream().filter(a -> a.startsWith("c")).count();
		System.out.println(count);
		Optional<String> first = cityList.stream().filter(a -> a.equals("banglore")).findFirst();
		System.out.println(first);
	}

}
