package fireDRill;

import java.util.Scanner;

public class Question3 {
    public static  void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        for(int i=0;i< 10;i++) {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            num = num + num;
        }
        int avg = num / 10;
        System.out.print("total score "+ num);
        System.out.print("average score "+ avg);
    }
}
