class largerOfTwo {
    // public static void main(String[] args) {
    // int a = 10;
    // int b = 20;
    // if (a > b) {
    // System.out.println("a is larger");
    // } else {
    // System.out.println("b is larger");
    // }
    // }

    // out of three is large

    public static void main(String[] manish) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a > b && a > c) {
            System.out.println("a is larger");

        }
        if (b > a && b > c) {
            System.out.println("b is larger");
        }

        if (c > a && c > b) {
            System.out.println("c is larger");
        }
    }
}