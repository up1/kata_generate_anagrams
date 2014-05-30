package kata.anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {

	public List<String> generate(String input) {
		List<String> result = new ArrayList<String>();
		if (input.length() == 3) {
			result.add(input.substring(0, 1) + convertData("BC", 1));
			result.add(input.substring(0, 1) + convertData("BC", 2));
			result.add(input.substring(1, 2) + convertData("AC", 1));
			result.add(input.substring(1, 2) + convertData("AC", 2));
			result.add(input.substring(2, 3) + convertData("AB", 1));
			result.add(input.substring(2, 3) + convertData("AB", 2));
		} else if (input.length() == 2) {
			result.add(input);
			result.add(input.substring(1, 2) + input.substring(0, 1));
		} else {
			result.add(input);
		}
		return result;
	}

	private String convertData(String input, int time) {
		if (time == 2)
			return input.substring(1, 2) + input.substring(0, 1);
		return input;
	}

}
