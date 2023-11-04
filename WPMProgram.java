package com.wpm;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {
	
	static String[] words = {"employee", "test", "java", "leetcode", "hackerrank", "lime", "pasta", "brownie", "employee", "TCS",
			                 "marina", "dog", "music", "happy", "success"};
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("1 GO!");
		TimeUnit.SECONDS.sleep(1);
		
		Random rand = new Random();
		for(int i=0; i<10; i++) {
		System.out.print(words[rand.nextInt(9)]+ " ");
		}
		System.out.println();
		
		double start = LocalTime.now().toSecondOfDay();
		
		Scanner sc = new Scanner(System.in);
		String typedwords = sc.nextLine();
		
		double end = LocalTime.now().toSecondOfDay();
		double elapsedTime = end-start;
		
		int numChars = typedwords.length();
		//{x characters/5} / 1min = y WPM
		int wpm = (int) ((((double) numChars/5) / elapsedTime) *60);
		System.out.println("Your WPM is " + wpm + "!");
	}
	

}
