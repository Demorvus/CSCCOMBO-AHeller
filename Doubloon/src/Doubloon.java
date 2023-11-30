
public class Doubloon {
	public static void main(String[] args) {
		System.out.println(isDoubloon("Cocoon")); // true
		System.out.println(isDoubloon("Hello")); // false
		System.out.println(isDoubloon("Anna")); // true
	}

	public static boolean isDoubloon(String word) {
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (Character.isLetter(c)) {
				int count = 0;
				for (int j = 0; j < word.length(); j++) {
					if (word.charAt(j) == c) {
						count++;
					}
				}
				if (count != 2) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}
}