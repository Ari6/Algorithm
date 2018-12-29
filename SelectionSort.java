package algorithm;

import java.util.Arrays;

public class SelectionSort {
	int[] select_method(int[] a) {
		int out[] = new int[a.length];
		out = a.clone();
		int min = 0;
		int min_index = 0;
		for (int i = 0; i < out.length; i++) {
			for (int j = i; j < out.length; j++) { // To find minimum element
				if (i == j) {
					min = out[j]; // Set first number as the smallest
					min_index = j;
				}
				if (min > out[j]) { //if min is greater than other elements, change min to it
					min = out[j];
					min_index = j;
				}
			}
			
			for (int j = min_index; j > i; j--) { // To swap elements
					out[j] = out[j-1]; // 
			}
			out[i] = min;
		}
		return out;
	}
	
	int[] selectionAnswer(int[] a) {
		int[] out = new int[a.length];
		out = a.clone();
		int min = Integer.MIN_VALUE;
		int min_index = 0;
		int temp = 0;
		
		for (int i = 0; i < out.length; i++) {
			min_index = i;
			min = out[i];
			for (int j = i; j < out.length; j++) {
				if (min > out[j]) {
					min = out[j];
					min_index = j;
				}
			}
			temp = out[i];
			out[i] = min;
			out[min_index] = temp;
		}
		
		return out;
		
	}
	
	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		int in_list[] = {Integer.MIN_VALUE, -1, Integer.MAX_VALUE, 4,Integer.MIN_VALUE, 6, 7};
		int[] out = new int[in_list.length];
		out = s.select_method(in_list);
		System.out.println("Original: " + Arrays.toString(out));
		out = s.selectionAnswer(in_list);
		System.out.println("Answer: " + Arrays.toString(out));

	}

}
