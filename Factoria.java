import java.util.Scanner;
 public class Factoria {
 public static void main(String[] arg) {
 Scanner input = new Scanner(System.in);
 
 System.out.print("Enter first integer: ");
 long choice = input.nextInt(); 
 long factoria = 1;
 long counter = 0;
 counter = choice;
 
while (counter != 0) {
 factoria = factoria * counter;
 counter--; }
System.out.printf("factoria %d%n", factoria );
 

 }
}