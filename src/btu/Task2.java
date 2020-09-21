package btu;
import java.util.*;

public class Task2 {
    Scanner input = new Scanner(System.in);
    System.out.println("\nEnter first num");
    int num1 = input.nextInt();
    System.out.println("Enter second num");
    int num2 = input.nextInt();
    int result1 = num1 / num2;
    int result2 = num2 % num1;

    System.out.println(result1 + "\n" + result2);
}
