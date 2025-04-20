import java.util.Scanner;
import java.util.Random;
public class Game {
 public static void main(String[] arg) {
 Scanner input = new Scanner(System.in);

 Random rand = new Random();
 int random = rand.nextInt(11);

 System.out.print("guess a number 1-10: ");
 int magic = input.nextInt();
 
 
 if (magic > random) System.out.println("too high");
if (magic < random) System.out.println("too low");
if (magic == random) System.out.println("you won");

System.out.print("guess a number 1-10: ");
  magic = input.nextInt();
 
 
 if (magic > random) System.out.println("too high");
if (magic < random) System.out.println("too low");
if (magic == random) System.out.println("you won");

System.out.print("guess a number 1-10: ");
  magic = input.nextInt();
 
 
 if (magic > random) System.out.println("too high");
if (magic < random) System.out.println("too low");
if (magic == random) System.out.println("you won");
else System.out.print("you loss"); 
 }
} 