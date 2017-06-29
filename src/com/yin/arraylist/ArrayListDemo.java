package com.yin.arraylist;

import java.util.ArrayList;

/**
 * This is a program that show how to make basic ArrayList program 
 * In this program we are using three method
 * 1) add()
 * 2) remove 
 * 3)add(-,-)
 * 
 */

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2, "m");
		l.add("N");
		System.out.println(l);
	}
}
