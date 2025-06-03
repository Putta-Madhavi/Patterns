package Patterns;

import java.util.Scanner;

//Alpha ramp pattern
public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Pattern(n);
	}

	public static void Pattern(int n) {
		for(int i=0;i<n;i++) {
			 char  ch=(char)('A'+ i);
			for(int j=0;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
