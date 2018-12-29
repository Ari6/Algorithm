package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.lang.System;

public class lisetTest {
	public static void main(String[] args) {
		List<String> one = new ArrayList<String>();
		String two = "INIT";
		one.add("ADD");
		change(one);
		change(two);
		System.out.println("One: " + java.lang.System.identityHashCode(one));
		System.out.println("Two: " + java.lang.System.identityHashCode(two));
	}
	
	private static void change(List<String> a) {
		a.add(0, "CHANGED");
		System.out.println("List: " + java.lang.System.identityHashCode(a));
		
	}
	private static void change(String a) {
		a = "CHANGED";
		System.out.println("String: " + java.lang.System.identityHashCode(a));
	}
}
