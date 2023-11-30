
class TimesTable {
	int[][] theTimesTable;

	TimesTable() {
		theTimesTable = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				theTimesTable[i][j] = (i + 1) * (j + 1);
			}
		}
	}

	public static int[][] createTimesTable(int rows, int cols) {

		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = (i + 1) * (j + 1);
			}
		}
		return result;
	}

	public static String printTimesTable(int[][] t) {

		String result = "";

		  for (int i = 0; i < t.length; i++) {
	            for (int j = 0; j < t[i].length; j++) {
	            	result += String.format("%4d", t[i][j]);
	            }
	            result += "\n";
	        }

		return result;

	}
	public String toString() {
		String result = "";
		for (int i = 0; i < theTimesTable.length; i++) {
			for (int j = 0; j < theTimesTable[i].length; j++) {
				result += String.format("%4d", theTimesTable[i][j]);
			}
			result += "\n";
		}
		return result;
	}
}
