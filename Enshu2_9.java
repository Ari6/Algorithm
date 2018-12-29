package algorithm;

public class Enshu2_9 {
	static int[][] mdays = {
		{31,28,31,30,31,30,31,31,30,31,30,31},
		{31,29,31,30,31,30,31,31,30,31,30,31}
	};
	
	static int isLeap(int year) {
		return ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int leftDayOfYear(int y, int m, int d) {	
		int day = 0;
		int ans;
		int leap = isLeap(y);
		for (int i = 0; i < m - 1; i++ ) {
			day += mdays[leap][i];
		}
		day += d;
		if ( leap == 1) {
			System.out.println(day);
			ans = 366 - day;
		} else {
			System.out.println(day);
			ans = 365 - day;
		}
		return ans;
	}
	public static void main(String[] args) {
		int ans;
		ans = leftDayOfYear(2018,12,31);
		System.out.print(ans);
	}
}
