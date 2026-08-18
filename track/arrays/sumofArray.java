
import java.util.Scanner;

public class sumofArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array: " + sum);
    }
}
