package Patterns;

import java.util.Scanner;

//number crown pattern
public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Pattern(n);
	}

	public static void Pattern(int n) {
		for(int i=1;i<=n;i++) {
			//number
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			//space
			for(int j=0;j<2*(n-i);j++) {
				System.out.print(" ");
			}
			//number
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
