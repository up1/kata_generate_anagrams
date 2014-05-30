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
			for (int i = 0; i < input.length(); i++) {
				result.add(input.substring(i, i + 1) + generate(convertData(input, i)).get(0));
				result.add(input.substring(i, i + 1) + generate(convertData(input, i)).get(1));
			}
		}
		return result;
	}

	private String convertData(String input, int round) {
		String result1 = input.substring(0, round);
		String result2 = input.substring(round + 1, input.length());
		return result1 + result2;
	}
}
