public class leapYearfind {

    public static void main(String[] args) {
        int year = 2016;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("this is the leap year");
                } else {
                    System.out.println("not the leap year");
                }
            } else {
                System.out.println("this is the leap y");
            }

        } else {
            System.out.println("this year is not a leap year");
        }

    }

}
