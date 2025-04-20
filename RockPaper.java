import java.util.Scanner;
import java.util.Random;
public class RockPaper {
 public static void main(String[] arg) {
 Scanner input = new Scanner(System.in);

 Random rand = new Random();
 int random = rand.nextInt(2);

 System.out.print("rock(1), paper(2) or scissor(0): ");
 int choice1 = input.nextInt();

 int scissor = 0;
 int rock = 1;
 int paper = 2;

 if (choice1 == scissor && random == rock) {
System.out.println("comupter is rock you lose"); }
 if (choice1 == scissor && random == paper) {
System.out.println("computr is paper you won"); }
 if (choice1 == scissor && random == scissor) {
System.out.println("computer is scissor draww"); }
 if (choice1 == rock && random == scissor) {
System.out.println("computer is scissor you won"); }
 if (choice1 == rock && random == paper) {
System.out.println("computer is paper you lose"); }
 if (choice1 == rock && random == rock) {
 System.out.println("computer is rock draw"); }
 if (choice1 == paper && random == rock) {
 System.out.println("computer is rock you won"); }
 if (choice1 == paper && random == scissor) {
 System.out.println("computer is scissor you lose"); }
 if (choice1 == paper && random == paper) {
System.out.println("computer is paper draw"); }
 
 }
}