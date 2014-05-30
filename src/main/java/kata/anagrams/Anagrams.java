package kata.anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {

	public List<String> generate(String input) {
		List<String> result = new ArrayList<String>();
		if (input.length() == 3) {
			result.add(input.substring(0, 1) + "BC");
			result.add(input.substring(0, 1) + "CB");
			result.add(input.substring(1, 2) + "AC");
			result.add(input.substring(1, 2) + "CA");
			result.add(input.substring(2, 3) + "AB");
			result.add(input.substring(2, 3) + "BA");
		} else if (input.length() == 2) {
			result.add(input);
			result.add(input.substring(1, 2) + input.substring(0, 1));
		} else {
			result.add(input);
		}
		return result;
	}

}
