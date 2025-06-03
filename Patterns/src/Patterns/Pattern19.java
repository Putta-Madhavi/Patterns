package Patterns;

import java.util.Scanner;
//symmetric-void pattern
public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Pattern(n);
	}

	public static void Pattern(int n) {
		for(int i=0;i<n;i++) {
			//spaces
            for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			//stars
            for(int j=0;j<2*i;j++) {
				System.out.print(" ");
			}
			//spaces
            for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower symmtrice
		for(int i=1;i<=n;i++) {
			//spaces
            for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//stars
            for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			//spaces
            for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
