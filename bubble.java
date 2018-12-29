package algorithm;
import java.util.*;

public class bubble {
	static int[] bubble_method(int[] in_list) {
		for (int j = in_list.length; j > 0; j--) {
			//System.out.println("j: " + j);
			for (int i = 0; i < in_list.length - 1; i++) {
				//System.out.println("i: " + i + "in: " + in_list[i] + " " + in_list[i+1]);
				if (in_list[i] > in_list [i+1]) {
					int temp = in_list[i];
					in_list[i] = in_list[i+1];
					in_list[i+1] = temp;
					//System.out.println(i);
				}
			}
		}
	return in_list;
	}
	
	public static void main(String[] args) {
		int in_list[] = {8, 3, 4, 4, 6, 7};
		bubble_method(in_list);
		System.out.println(Arrays.toString(in_list));			
	}
}
