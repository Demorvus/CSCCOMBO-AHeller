
public class ArrayExtercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 2, 3, 4, 5};
		int value1 =3 ;
		if (FindValue(array1,value1)) {
		System.out.println("The value" + value1 + "exists in array");
		
	}

}

	private static boolean FindValue(int[] array1, int value1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 3) {
				return true;
			}
		}
		return false;
	}

}
