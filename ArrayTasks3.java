public class ArrayTasks3 {
	public static void main(String[] args) {
		//задание 3.Макс. эл-т
		int[] a = {2, 4, 6, 8};

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Максмум:" + max);

	}
}
