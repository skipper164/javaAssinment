import java.util.Scanner;
import java.util.Random;
public class Game2 {
 public static void main(String[] arg) {
 Scanner input = new Scanner(System.in);

 Random rand = new Random();
 int stop = 0;
while (stop < 3) {
 System.out.print("guess a number 1-10: ");
int magic = input.nextInt();
int random = rand.nextInt(11);
 stop += 1;
 if (magic > random) System.out.println("too high");
if (magic < random) System.out.println("too low");
if (magic == random) { System.out.println("you won");
break; }


 }

 
}
} 