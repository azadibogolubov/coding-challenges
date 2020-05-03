import java.util.*;

public class CheckStringIsPermutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str1 = "abcdefghia";
		String str2 = "bacdefghi";
		System.out.println(checkPerm(str1, str2));
	}
	
	// Cases: check if str or str2 are null.
	// if both are null, then we can return true, as null is permutation of null.
	// if one is null, but not the other, then we have a false (use DeMorgan's law for this) - Not implemented
	// if not same length, return false.
	// if same length, compare.
	private static boolean checkPerm(String input, String input2) {
		if (input == null && input2 == null) {
			return true;
		}
		else if (input.length() != input2.length()) {
			return false;
		}
		
		char[] charArr = input.toCharArray();
		char[] charArr2 = input2.toCharArray();
		
		Arrays.sort(charArr);
		Arrays.sort(charArr2);
		
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] != charArr2[i]) {
				return false;
			}
		}
		return true;
	}
}