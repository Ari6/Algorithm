package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Ex3_3 {

	public static void main(String[] args) {
		int[] a = new int[] {1,9,2,9,4,6,7,9};
		int[] b = new int[a.length];
		System.out.println(searchIdx(a, 9, b) + ":" + Arrays.toString(b));

	}
	static int searchIdx(int[] a, int key, int[] idx) {
		//int count = 0;
		List<Integer> out = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				out.add(i);
			}
		}

		for(int i = 0; i < out.size(); i++) {
			idx[i] = out.get(i);
		}
		return out.size();
	}
}
