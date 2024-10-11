

public class program {
    public static void main(String[] args) {
        System.out.println("Program begins here");

        // Type Conversion in Java

        byte b = 127;
        int a = 12;

        a = b;  // Conversion is automatically done by machine
        b = (byte)a;    // Casting means explicit conversion

        float f = 5.6f;
        int x = (int)f; // float into int// here we will use deciaml values

        System.out.println(f);
        System.out.println(x);

        byte d = 127;
        System.out.println(d);
        int c = 257;
        System.out.println(c);
        d = (byte)c; // d = 257 % 256
                    //  (number stored in variable) % (range of byte)

        System.out.println(d);  // output: 1


        float g = 5.6f;
        System.out.println(f);  // 5.6

        // int t = f;  // It will give error because of loss of some values
        int t = (int)f;
        System.out.println(t);


        // Type Promotion
        byte m = 10;
        byte n = 30;
        int result = m *n; // here this multiplication value will be promoted from byte to int
        System.out.println(o);


    }
}
/*
 * Type Coversion and Casting 
 * Type promotion : Type promotion in Java is the automatic conversion of a smaller data type to a larger data type during expression evaluation. This is done to avoid data loss and ensure that all expressions are evaluated using the same data type. 

 * 
 * NOTE: java filename.jav
 * This can be used to run the java code but it is not recommended
 */