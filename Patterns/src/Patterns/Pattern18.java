package Patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Pattern(n);
	}

	public static void Pattern(int n) {
		for(int i=0;i<n;i++) {
			for(char ch=(char)('E'-i);ch<='E';ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
