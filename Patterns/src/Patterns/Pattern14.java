package Patterns;

import java.util.Scanner;

//increasing letter triangle pattern
public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Pattern(n);
	}

	public static void Pattern(int n) {
		for(int i=0;i<n;i++) {
			for(char ch='A';ch<='A'+i;ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
