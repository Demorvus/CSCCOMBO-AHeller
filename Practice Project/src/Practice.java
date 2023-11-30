
public class Practice {
//	check class and method curly braces are aligned by clicking on them.
// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 4 };
//		call a method by name and passing it its required arguments. no14 is name and nums is argument 
		System.out.println(no14(nums)); //MethdodCall if you pass a method a string it must be set up to receive a string and the same goes for doubles ints ext.
//		The stuff within parentheses has to match within method and method call!
	}
//Method must receive arguments that are within the parentheses 
	public static boolean no14(int[] nums) {//this is the method 
		boolean hasOne = false;
		boolean hasFour = false;
		for (int num : nums) {
			if (num == 1) {
				hasOne = true;
			}
			if (num == 4) {
				hasFour = true;
			}
		}
		return !hasOne || !hasFour;
	}
}
