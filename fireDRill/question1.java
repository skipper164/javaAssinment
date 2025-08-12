package phasegate;

import java.util.Scanner;

public class question1 {
    public static  void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        for(int i=0;i< 10;i++) {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            num = num + num;
        }
        System.out.print("total score "+ num);
    }
}
