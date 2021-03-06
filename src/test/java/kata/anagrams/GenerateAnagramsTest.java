package kata.anagrams;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GenerateAnagramsTest {

	@Test
	public void Input_Empty_Should_Return_Empty() {
		Anagrams anagrams = new Anagrams();
		List<String> result = anagrams.generate("");
		assertEquals(list(""), result);
	}

	@Test
	public void Input_with_one_character_Should_Return_same_input() {
		Anagrams anagrams = new Anagrams();
		List<String> result = anagrams.generate("A");
		assertEquals(list("A"), result);
	}

	@Test
	public void Input_with_two_character_Should_Return_2_input() {
		Anagrams anagrams = new Anagrams();
		List<String> result = anagrams.generate("AB");
		assertEquals(list("AB", "BA"), result);
	}
	
	@Test
	public void Input_with_three_character_Should_Return_6_input() {
		Anagrams anagrams = new Anagrams();
		List<String> result = anagrams.generate("ABC");
		assertEquals(list("ABC", "ACB", "BAC", "BCA", "CAB", "CBA"), result);
	}
	
	@Test
	public void Input_with_biro_character_Should_Return_24_output() {
		Anagrams anagrams = new Anagrams();
		List<String> result = anagrams.generate("biro");
		assertEquals(list("biro", "bior", "brio", "broi", "boir", "bori"
				,"ibro", "ibor", "irbo", "irob", "iobr", "iorb"
				,"rbio", "rboi", "ribo", "riob", "robi", "roib"
				,"obir", "obri", "oibr", "oirb", "orbi", "orib"), result);
	}

	private List<String> list(String... strings) {
		List<String> list = new ArrayList<String>();
		for (String string : strings) {
			list.add(string);
		}
		return list;
	}

}
