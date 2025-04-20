import java.util.Scanner;
 public class RaisedPower {
 public static void main(String[] arg) {
 Scanner input = new Scanner(System.in);
 
 System.out.print("Enter value integer: ");
 long choice = input.nextLong(); 
 System.out.print("enter raised to power: ");
 long power = input.nextLong(); 
 
 long counter = 0;
 counter = power;
 
while (counter != 0) {
 choice = choice * counter; 
 counter--; }
System.out.printf("power is %d%n", choice );
 

 }
}