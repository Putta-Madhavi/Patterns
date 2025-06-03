package Patterns;

import java.util.Scanner;

//Reversing letter triangle pattern
public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Pattern(n);
	}

	public static void Pattern(int n) {
		for(int i=0;i<n;i++) {
			for(char ch='A';ch<'A'+(n-i);ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
