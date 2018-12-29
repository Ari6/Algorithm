package algorithm;

import algorithm.Ex3_2;

public class Ex3_4 {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5,6,7,8};
		Ex3_2.makeFormat(a);
		System.out.println(binSearch(a, 9));
	}

	public static int binSearch(int[] a, int key) {
		int start = 0;
		int end = a.length-1;
		int center = 0;
		
		while (start <= end) {
			center = (end + start) / 2;
			System.out.print("  |");
			for (int i = 0; i < a.length; i++) {
				if (i == start) {
					System.out.print("<-");
				} else {
					if(i == end) {
						System.out.print("->");
					} else {
						if (i == center) {
							System.out.print(" +");
						} else {
							System.out.print("  ");
						}
					}
				}
			}
			System.out.println();
			System.out.print(" " + center + "|");
			for(int i = 0; i < a.length; i++) {
				System.out.print(" " + a[i]);
			}
			System.out.println();
			if (key == a[center]) {
				return center;
			} else {
				if(key < a[center]) {
					end = center - 1;
				} else {
					start = center + 1;
				}
			}
		}
		return -1;
	}
}