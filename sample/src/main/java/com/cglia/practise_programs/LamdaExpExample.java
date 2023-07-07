package com.cglia.practise_programs;

@FunctionalInterface
interface Sayable {
	void show(String message);
}

public class LamdaExpExample {
	public static void main(String[] args) {

		Sayable monitor = (message) -> {
			System.out.println("message is viewed");
		};
		monitor.show("ok");
	}
}
