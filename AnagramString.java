package ZohoTest;

public class AnagramString {

	public static void main(String[] args) {
		String str = "abba";
//		String str = "abcd";
		AnagramString anagram = new AnagramString();
		System.out.println(anagram.numberOfPairs(str));

	}

	public int numberOfPairs(String str) {

		int count = 0;

		for (int window = 1; window < str.length(); window++) {

			int left = 0;
			int right = 0;

			while (right < window - 1) {
				right++;
			}

			int[] ref = new int[26];
			for (char ch : str.substring(left, right + 1).toCharArray()) {
				ref[ch - 'a']++;
			}
			ref[str.charAt(right) - 'a']--;

			while (right < str.length()) {

				ref[str.charAt(right) - 'a']++;

				int l = left + 1;
				int r = right + 1;

				int[] curCount = new int[26];
				for (char ch : str.substring(l, r).toCharArray()) {
					curCount[ch - 'a']++;
				}

				while (r < str.length()) {

					curCount[str.charAt(r) - 'a']++;

					if (isEqualArray(ref, curCount)) {
						System.out.println(str.substring(l, r + 1));
						count++;
						break;
					}

					curCount[str.charAt(l) - 'a']--;

					l++;
					r++;

				}

				ref[str.charAt(left) - 'a']--;

				right++;
				left++;

			}

		}

		return count;

	}

	private boolean isEqualArray(int[] ref, int[] curCount) {

		for (int i = 0; i < ref.length; i++) {
			if (ref[i] != curCount[i]) {
				return false;
			}
		}

		return true;
	}

}
