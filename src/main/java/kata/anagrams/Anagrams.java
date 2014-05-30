package kata.anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {

	public List<String> generate(String input) {
		List<String> result = new ArrayList<String>();
		if (input.length() <= 1) {
			result.add(input);
		} else {
			for (int i = 0; i < input.length(); i++) {
				for (int j = 0; j < input.length() - 1; j++) {
					result.add(input.substring(i, i + 1) + generate(convertData(input, i)).get(j));
				}
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
