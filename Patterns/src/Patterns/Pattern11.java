package Patterns;
//binary number triangle pattern 
import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Pattern(n);
	}

	public static void Pattern(int n) {
		for(int i=1;i<=n;i++) {
			int start;
			if(i%2==0) {
				start=0;
			}else {
				start=1;
			}
			for(int j=1;j<=i;j++) {
				System.out.print(start);
				start=1-start;
			}
			System.out.println();
		}
	}
}
