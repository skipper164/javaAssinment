import java.util.Scanner;
public class Largest {
public static void main(String[] arg) {
Scanner input = new Scanner (System.in);

System.out.print("enter first number: ");
int skipper1 = input.nextInt();
System.out.print("enter second number: ");
int skipper2 = input.nextInt();
System.out.print("enter third nummber: ");
int skipper3 = input.nextInt();
System.out.print("enter 4th number: ");
int skipper4 = input.nextInt();
System.out.print("enter 5th number: ");
int skipper5 = input.nextInt();

int largest = skipper1;
int smallest = skipper2;

if  (skipper2 > largest) largest = skipper2; 
if  (skipper3 > largest) largest = skipper3; 
if  (skipper4 > largest) largest = skipper4;
if  (skipper5 > largest) largest = skipper5; 

if (skipper1 < smallest) smallest = skipper1;  
if  (skipper3 < smallest) smallest = skipper3; 
if  (skipper4 < smallest) smallest = skipper4; 
if  (skipper5 < smallest) smallest = skipper5; 

int even1 = 0;
int even2 = 0;
int even3 = 0;
int even4 = 0;
int even5 = 0; 

if  (skipper1 % 2 == 0) even1 = skipper1;
if  (skipper2 % 2 == 0) even2 = skipper2;
if  (skipper3 % 2 == 0) even3 = skipper3;
if  (skipper4 % 2 == 0) even4 = skipper4;
if  (skipper5 % 2 == 0) even5 = skipper5;

int sum = (even1 + even2 + even3 + even4 + even5) / 5;  ;

 System.out.printf("largest %d%n", largest); 
 System.out.printf("smallest %d%n", smallest);
 System.out.printf("average of even numbber %d%n", sum ); 
 }
}