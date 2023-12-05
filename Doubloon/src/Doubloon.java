
public class Doubloon {
	public static void main(String[] args) {
		System.out.println(isDoubloon("Cocoon"));
		System.out.println(isDoubloon("Hello"));
		System.out.println(isDoubloon("Anna"));
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