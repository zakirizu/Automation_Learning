package task_Package;

import java.util.Arrays;

public class ReturnType_Task {
	
	public static void main(String[] args) {
		boolean iseven = isEven(4);
		System.out.println(iseven);
		
	
		int maxNumber = getMax(20, 20);
		System.out.println(maxNumber);
		
		double averageResult = calculateAverage(10, 20, 30);
		System.out.println(averageResult);
		
		char grade = getGrade(92);
		System.out.println(grade);
		
		
		int[] arr = {4, 2, 7, 1, 9};
		int sumArr = sumOfArray(arr);
		System.out.println(sumArr);
		
		int secondSmallest = getSecondSmallest(arr);
		System.out.println(secondSmallest);
		
		getEvenNumbers(12);
	}

	
	
	/*
	 * Task 01: 
	 * Create a method isEven(int number) that returns true if the number is even, else false.
	 */
	private static boolean isEven(int a) {		
		if(a%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

	/*
	 * Task 02:
	 * Create a method getMax(int a, int b) that returns the maximum of two numbers.
	 */
	
	private static int getMax(int a, int b) {
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	/*
	 * Task 03: 
	 * Write a method calculateAverage(int a, int b, int c) that returns the average of three numbers. Then store that double
	 *  value in a variable and add 10 to that variable and print the result.
	 */
	
	private static double calculateAverage(int a, int b, int c) {
		double average = (a + b + c) / 3.0;
		double result = average + 10;
		return result;
	}
	
	
	/*
	 * Task 04: 
	 * Create a method isPalindrome(String str) that returns true if the given string is a palindrome, else false.
	 */
	
	/*Task 05: 
	 * Create a method getGrade(int marks) that returns a character grade:
		A if marks ≥ 90
		B if marks ≥ 75
		C if marks ≥ 50
		F otherwise
	 */
	private static char getGrade(int marks) {
		if(marks >= 90)
		{
			return 'A';
		} 
		else if(marks >= 75) 
		{
			return 'B';
		} 
		else if(marks >= 50)
		{
			return 'C';
		} 
		else {
			return 'F';
		}
	}
	
	/*
	 * Task 06: 
	 * Create a method that takes an random array of integers as input and returns the sum of all elements in the array.
	 */
	private static int sumOfArray(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	
	
	/*
	 * Task 07: 
	 * Create a method that takes an array of integers as input and returns the 2nd smallest of all elements in the array.
	 */
	private static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}
	
	/*
	 * Task 08 : Write a method getEvenNumbers() It should accept the int values and should print all the even number till there.
	 */
	
	private static void getEvenNumbers(int number) {
	for(int i=1; i<=number; i++) {
		if(i%2==0) {
			System.out.print(i + " ");
		}
	}
	
	}
}
