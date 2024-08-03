
public class first {
    public static void main(String[] args) {
        System.out.println("Program begins here");
        float marks1 = 6.5687684678671697987168f; // here, it is a float value, f is needed to explicitely make it a float datatype
        double marks2 = 6.554434846384368436; // here, it is a double value by default in java
        System.out.println(marks1);
        System.out.println(marks2);

        char c = 'k';
        // Use Single quote for char and double quote for string
        System.out.println(c);

        boolean b = true;
        System.out.println(b);


        int num3 = 54;
        byte by = 127;
        short sh = 558;
        long l = 58541l; // l is added at last
        float f = 5.8f;
        boolean bool = true;
        char chr = '8';

    }
}
/*
 * We have multiple datatypes to store multiple types of data.
 * Datatype can be classified into two types: 1. Primitive 2. Derived
 * Primitive Datatypes: 1. integer 2. float 3. character 4. boolean
 * 1. integer : byte, short, int, long
 * 2. float : double, float
 * 3. characters : 'char', "String"
 * 4. boolean : boolean (true, false) NOTE: 0 & 1 are not used
 * 
 * Size of different datatypes:
 * int - 4 bytes
 * long - 8 bytes
 * short - 2 bytes
 * byte - 1 byte = -(2^7) to (2^7 - 1) = -128 to 127
 * float - 4 bytes
 * double(default) - 8 bytes
 * char - 2 bytes
 * Java supports UNICODE
 * 
 * 
 * 
 */