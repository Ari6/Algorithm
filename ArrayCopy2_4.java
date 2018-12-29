package algorithm;

public class ArrayCopy2_4 {
	static int[] copy(int[] b) {
		int[] a = new int[b.length];
		for(int i = 0; i < b.length; i++) {
			a[i] = b[i];
			System.out.print("b: " + b[i] + " " + " a: " + a[i]);
		}
		return a;
	}
	public static void main(String[] args) {
		int[] b = {1,2,3,4,6};
		int[] a = copy(b);
		for(int i = 0; i < b.length; i++) {
			System.out.println(a[i]);
		}
	}
}