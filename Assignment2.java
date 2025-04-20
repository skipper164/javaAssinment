import java.util.Scanner;
 public class Assignment2 {
 public static void main(String[] arg) {
 Scanner input = new Scanner(System.in);

 System.out.print("how many values are you comparing?: ");
 int power = input.nextInt(); 

 System.out.print("Enter value integer: ");
 int choice1 = input.nextInt(); 
 
 
 int counter = 0;
 counter = power - 1;
 int largest = choice1;
 int smallest = choice1;

while (counter != 0) {
System.out.print("Enter value integer: ");
 int choice2 = input.nextInt(); 
 if (choice2 > largest) largest = choice2;
 if (choice2 < smallest) smallest = choice2;
 power = power * counter; 
 counter--; }
System.out.printf("largest is %d%n", largest );
System.out.printf("smallest is %d%n", smallest);

 }
}