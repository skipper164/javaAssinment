package fireDRill;

import java.util.Scanner;

public class question10 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num  <= 100) {
                sum = sum + num;

            }

        }

        System.out.print("sum is  "+ sum);

    }
}
