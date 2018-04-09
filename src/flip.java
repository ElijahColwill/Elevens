import java.util.Random;

class Flip {


	public static void main(String[] args) {
		System.out.println(flipCoin());
		System.out.println(flipCoin());
		System.out.println(flipCoin());
		System.out.println(flipCoin());
		System.out.println(flipCoin());
		System.out.println(flipCoin());
		System.out.println(flipCoin());
		System.out.println("---");
		int[] array1 = new int[]{1, 2, 3, 5, 400};
		int[] array2 = new int[]{1, 3, 2, 400, 5};
		System.out.println(arePermutation(array1, array2));
		int[] array3 = new int[]{1, 3, 4, 5};
		int[] array4 = new int[]{1, 2, 4, 5};
		System.out.println(arePermutation(array3, array4));
	}

	public static boolean flipCoin() {
		Random random = new Random();
		int j = random.nextInt(3);
		return j == 1 || j == 2; 
	}

	public static boolean arePermutation(int[] array1, int[] array2) {
		int count = 0;
		for (int j = 0; j < array1.length; j++) {
			for (int k = 0; k < array2.length; k++) {
				if (array1[j] == array2[k]) {
					count++;
				}
			}
		}
		return count == array1.length;
	}

}