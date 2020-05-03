import java.util.*;

public class CheckStringIsUniq
{
	private static HashSet<Character> seenChars = new HashSet<>();
	public static void main (String[] args) throws java.lang.Exception
	{
		String uniq = "abcdefghi";
		String nonUniq = "abcdabcd";
		System.out.println(checkUniq(uniq));
		System.out.println(checkUniq(nonUniq));
	}
	
	private static boolean checkUniq(String input) {
		for (char c: input.toCharArray()) {
			if (seenChars.contains(c)) {
				return false;
			}
			else {
				seenChars.add(c);
			}
		}
		return true;
	}
}