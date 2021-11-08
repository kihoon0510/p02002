package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(new String[] { "abc", "def", "ghi" },
				new String[] { "ABC", "DEF", "GHI" });

		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

		strStrm.map(String::toLowerCase).distinct().sorted().forEach(System.out::println);
		

	}
}


