public class first {
    public static void main(String[] args) {
        System.out.println("Program begins here");

        //literals
        int num1 = 585;
        System.out.println(num1);

        // to store binary numbers
        int num2 = 0b101;
        System.out.println("Decimal equivalent of binary number 101: " + num2);

        //we can put underscore between numbers to easily read these numbers
        // In output, it gives normal number
        int num3 = 10_00_000;
        System.out.println(num3);

        double num4 = 50;   // it will automatically convert 50 int into 50.0 double
        System.out.println(num4);

        double num5 = 12e10;
        System.out.println(num5);

        boolean num6 = false;
        System.out.println(num6);

        char c = 'A';
        c++;
        System.out.println(c);


    }
}
