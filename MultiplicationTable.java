import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int[] m = new int[10];
        for (int i = 1; i <= 10; i++) {
            m[i-1]= i*n;
        }
        System.out.println("Multiplication table of "+n+" :");
		for(int i=1;i<=10;i++){
			System.out.println(n+" * "+i+" = "+m[i-1]);
		}
    }
}