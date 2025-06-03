package Patterns;
//inverted numbered right pyramid
import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Pattern(n);
	}

	public static void Pattern(int n) {
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
	}

}
