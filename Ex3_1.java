package algorithm;

public class Ex3_1 {
	public static void main(String[]  args) {
		System.out.println(seqSearch(new int[]{-3,25,3,-4},4, 3));
	}
	public static int seqSearch(int[] a, int n, int key) {
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				return i;
			}
			i++;
		}
		return -1;
	}
}
