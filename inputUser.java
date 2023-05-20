import java.util.Scanner;

public class inputUser {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the user input here");
        String name = s.nextLine();
        System.out.println("the user is input the value is " + name);
        System.out.println("enter the age");
        int age = s.nextInt();
        System.out.println("this is the  age of the user is  :" + age);
        System.out.println("this is the user phone number");
        long phone = s.nextLong();
        System.out.println("this is the user phone :" + phone);
    }
}
