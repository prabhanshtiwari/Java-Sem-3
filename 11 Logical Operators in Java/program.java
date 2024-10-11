
public class program {
    public static void main(String[] args) {
        System.out.println("Program begins here");

        int x = 7;
        int y = 5;
        int a = 5;
        int b= 9;

        boolean result = x > y && a > b;
        System.out.println(!result);    // reverse the result from false to true


    }
}
/*
 * Logical Operators: &(AMPERSAND), && - AND, |(PIPE), || - OR, ! - NOT 
 * used to combine two or more conditions
 * 
 * Logical AND Operation:
 * true AND true = true
 * true AND false = false
 * false AND true = false
 * false AND false = false
 *  
 * Logical OR Opeation:
 * true OR true = true
 * true OR false = true
 * false OR true = true
 * false OR false = false
 * 
 * Logical NOT Operation: used to reverse the result
 * NOT true = false
 * NOT false = true
 * 
 * USE && instead of &
 * USE || instead of |
 * 
 */