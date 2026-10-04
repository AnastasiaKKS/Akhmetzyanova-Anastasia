public class ArrayTasks2 {
	public static void main(String[] args) {
		//*задание 2. Сумма эл-ов
		int[] a = new int[args.length];

		for (int i = 0; i < args.length; i++) {
			a[i] = Integer.parseInt(args[i]);
		}

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}

		System.out.println("сумма:" + sum);
	}
}