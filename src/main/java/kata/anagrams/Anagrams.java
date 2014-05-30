package kata.anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {

	public List<String> generate(String input) {
		List<String> result = new ArrayList<String>();
		if (input.length() <= 1) {
			result.add(input);
		} else if (input.length() == 2) {
			result.add(input);
			result.add(input.substring(1, 2) + input.substring(0, 1));
		} else {
			result.add(input.substring(0, 1) + generate(convertData(input, 0)).get(0));
			result.add(input.substring(0, 1) + generate(convertData(input, 0)).get(1));
			result.add(input.substring(1, 2) + generate(convertData(input, 1)).get(0));
			result.add(input.substring(1, 2) + generate(convertData(input, 1)).get(1));
			result.add(input.substring(2, 3) + generate(convertData(input, 2)).get(0));
			result.add(input.substring(2, 3) + generate(convertData(input, 2)).get(1));
		}
		return result;
	}

	private String convertData(String input, int round) {
		String result1 = input.substring(0, round);
		String result2 = input.substring(round + 1, input.length());
		return result1 + result2;
	}
}
