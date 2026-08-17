
import java.util.Scanner;

public class reverse_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        // Taking input
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Printing array in reverse
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
