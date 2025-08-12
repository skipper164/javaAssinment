import java.util.Scanner;
 public class Grading {
 public static void main(String[] arg) {
 Scanner input = new Scanner(System.in);

String exam = """
80 - 100 = A
70 - 79 = B
60 - 69 = c
50 - 59 = D
0 - 49 = F
""";
System.out.printf(exam); 

  int counter = 0;
 while (counter < 10) {

 System.out.print("Enter score: ");
  int score = input.nextInt();
  
if (score > 100) System.out.print("enter valid score");

  
switch (score / 10){
  case 10, 9, 8 : System.out.println("A"); break;
  case 7 : System.out.println("B"); break;
  case 6 : System.out.println("C"); break;
  case 5 : System.out.println("D"); break;
  case 4, 3, 2, 1, 0 : System.out.println("f"); break;
  default :
}
 

 counter++;
 }

  } 
}
 