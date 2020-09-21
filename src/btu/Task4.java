package btu;
import java.util.*;

public class Task4 {
    private Scanner input = new Scanner(System.in);

    public void Task4(){
        System.out.println("\nEnter three digit num:");
        int three_digit = input.nextInt();

        if((three_digit / 100) >= 1 && (three_digit / 100) < 10){
            System.out.format("%d\n%d\n%d", (three_digit / 100), ((three_digit % 100) / 10), (three_digit % 10));
        }

        else {
            System.out.println("\nThe number entered is not three digit.\nTrying again...\n");
            this.Task4();
        }
    }
}
