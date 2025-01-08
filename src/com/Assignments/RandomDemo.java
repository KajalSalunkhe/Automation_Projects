package com.Assignments;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random rnd = new Random();
		int i = rnd.nextInt(11);		//Generate any random no in the range of 0 to 10
		System.out.println(i);
	}

}
