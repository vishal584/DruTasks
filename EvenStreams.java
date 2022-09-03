package assigmet;

import java.util.Arrays;
import java.util.List;

public class EvenStreams {
   public static void main(String[] args) {
     List<Integer> numbers = Arrays.asList(4, 3, 9, 7, 8);
     numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
   }

}