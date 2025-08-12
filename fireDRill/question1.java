package fireDRill;

import java.util.Scanner;

public class question1 {
    public static  void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for(int i=0;i< 10;i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            sum = sum + num;
        }

        System.out.print("total score "+ sum);
    }
}
