package Patterns;

import java.util.Scanner;

// Increasing number triangle pattern (continuous)
public class Pattern13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();
        Pattern(n);
    }

    public static void Pattern(int n) {
        int num = 1; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num=num+1; 
            }
            System.out.println();
        }
    }
}
