
import java.util.Scanner;

public class MeanHeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[11];
		System.out.println("Enter Height of 11 Players below : ");
		for (int i= 0;i<arr.length;i++){
			arr[i] = sc.nextDouble();
		}
	
		double sum =0;
		for(int j =0;j<arr.length;j++){
			sum= sum+arr[j];
		}
		System.out.println("Mean Height of all players is = "+sum/11);
	}
}