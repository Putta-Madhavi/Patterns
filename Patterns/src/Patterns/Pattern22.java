package Patterns;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Pattern(n);
	}

	public static void Pattern(int n) {
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<2*n-1;j++) {
				int top=i;
				int bottom=i;
				int right=(2*n-2)-j;
				int left=(2*n-2)-i;
				System.out.print(n-Math.min(Math.min(top, bottom), Math.min(left, right))+ ' ');
			}
			System.out.println();
		}
	}

}
