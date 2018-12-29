
package algorithm;
import java.util.Scanner;

public class CardConvRev {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		int rest = 0;
		String dchar = "0123456789abcdefghijklmnopqrstuvwxyz";
		System.out.println(r + " | " + x);
		do {			
			System.out.println("  +--------");
			d[digits++] = dchar.charAt(x % r);
			rest = x % r;
			x /= r;
			System.out.println(r + " | " + x + "  ..." + rest);
		} while(x != 0);
		return digits;
	}
	
}
