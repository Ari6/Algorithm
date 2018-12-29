package algorithm;

public class Ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex3_2(new int[] { 1,2,3,4,5,6,7 }, 4);
	}
	public static void ex3_2(int[] a, int b) {
		makeFormat(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print("  |");
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		System.out.print(" " + i + "|");

			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + a[j]);
			}
			System.out.println();
			if (b == a[i]) {
				System.out.println(b + " is in a[" + i + "].");
				break;
			}
		}
	}
	static void makeFormat(int[] a) {
		System.out.print("  |");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.print("--+");
		for(int i = 0; i < a.length; i++) {
			System.out.print("--");
		}
		System.out.println();
	}
}
