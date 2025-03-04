import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];
		int i = 0;
		while (true) {
			double n = sc.nextDouble();
			if (n <= 0) {
				break;
			}
			arr[i] = n;
			i++;
			if (i == 10) {
				break;
			}
		}
		
		//System.out.println(Arrays.toString(arr));
		double sum =0;
		for(int j =0;j<arr.length;j++){
			sum= sum+arr[j];
		}
		System.out.println(sum);
	}
}