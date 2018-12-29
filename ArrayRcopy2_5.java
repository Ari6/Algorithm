package algorithm;

public class ArrayRcopy2_5 {
	public int[] rcopy(int[] a) {
		int[] b = new int[a.length];
		for ( int i = 0; i < a.length; i++) {
			b[i] = a[b.length-i-1];
		}
		return b;
	}
	static public void main(String[] args) {
	}
}
