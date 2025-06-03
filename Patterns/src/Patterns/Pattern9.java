package Patterns;
//diamond star pyramid
import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Pattern(n);
	}

	public static void Pattern(int n) {
		//upper diamonnd
		for(int i=1;i<=n;i++) {
			//space 
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			//space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		//lower diamond
		for(int i=0;i<n;i++) {
			//space
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=0;j<2*(n-i)-1;j++) {
				System.out.print("*");
			}
			//space
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
