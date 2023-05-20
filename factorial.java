import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int fact;
        for (int i = 1; i <= number; i++) {
            fact = i * number;
            System.out.println(fact);
        }

    }
}
