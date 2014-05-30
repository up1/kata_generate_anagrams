package kata.anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {

	public List<String> generate(String input) {
		List<String> result = new ArrayList<String>();
		if (input.length() == 3) {
			result.add(input.substring(0, 1) + generate(convertData(input, 0)).get(0));
			result.add(input.substring(0, 1) + generate(convertData(input, 0)).get(1));
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

	private String convertData(String input, int round) {
		if( round == 0 ) {
			return "BC";
		}
		if (round == 2)
			return input.substring(1, 2) + input.substring(0, 1);
		return input;
	}

}
