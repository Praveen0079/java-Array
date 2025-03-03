import java.util.Arrays;
import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter 5 numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr){
            if(num > 0 ){
                if(num%2==0){
                    System.out.println(num+" is Even number");
                }
                else System.out.println(num+" is Odd number");
            } else if (num == 0) {
                System.out.println("Zero");
            }
            else System.out.println(num+" is Negative number");
        }
        if(arr[0] > arr.length){
            System.out.println("1st number is greater than last number");
        }
        else if(arr[0]< arr.length){
            System.out.println("Last number is greater than 1st number");
        }
        else{
            System.out.println("1st and last number are equal");
        }
    }
}
