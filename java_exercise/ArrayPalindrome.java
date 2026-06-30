package MediSphere.java_exercise;
import java.util.Scanner;

public class ArrayPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        boolean palindrome = true;

        for (int i = 0; i < n / 2; i++) {

            if (arr[i] != arr[n - i - 1]) {
                palindrome = false;
                break;
            }
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}