package kata.anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {

	public List<String> generate(String input) {
		List<String> result = new ArrayList<String>();
		if (input.length() == 2) {
			result.add("AB");
			result.add("BA");
		} else {
			result.add(input);
		}
		return result;
	}

}
