
import java.util.Scanner;

public class table {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the number you want to get the table");
        int number = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }

    }
}
