package fireDRill;

import java.util.Scanner;

public class Question5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num % 2 == 0) {
                sum = sum + num;
            }

        }
            System.out.print("sum of the even numbers "+ sum);

    }
}

