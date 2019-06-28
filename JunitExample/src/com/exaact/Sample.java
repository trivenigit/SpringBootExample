package com.exaact;

public interface Sample {
	public void test();

	public default void small() {
		System.out.println("asdcsadf");
	}
}
