package MediSphere.java_exercise;
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            int count = 1;

            if (str.charAt(i) == ' ')
                continue;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            boolean visited = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == str.charAt(i))
                    visited = true;
            }

            if (!visited)
                System.out.println(str.charAt(i) + " : " + count);
        }
    }
}