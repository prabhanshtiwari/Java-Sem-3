
public class program {
    public static void main(String[] args) {
        System.out.println("Program begins here");

        int n = 8;
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter number between 1 and 7");
                break;
        }

        // if (n == 1)
        // System.out.println("Monday");
        // else if (n == 2)
        // System.out.println("Tuesday");
        // else if (n == 3)
        // System.out.println("Wednesday");
        // else if (n == 4)
        // System.out.println("Thursday");
        // else if (n == 5)
        // System.out.println("Friday");
        // else if (n == 6)
        // System.out.println("Friday");
        // else
        // System.out.println("Sunday");




        // What is new in Java Switch?

        // Before Java5 only int was supported in switch, but after java5, int and String both were used in switch statement

        // Day based alarm: 

        String day = "Saturday";
        String result = "";

        result = switch(day) 
        {
            // We can used arrow here to avoid using break keyword everytime
            // We can use switch as an expression, 
            // To avoid using -> arrow use : colon and then write yeild keyword
            case "Saturday", "Sunday": yield "6am"; 
            case "Monday": yield "8 am";
            default: yield "7 am";
            // case "Saturday", "Sunday": "6am"; 
            // case "Monday"-> "8 am";
            // default-> "7 am";
        };// NOTE: After expression we use a semicolon
        System.out.println(result);

        





    }
}
/*
 *Switch Statement :  
 * Eg:
 * 1 - Monday
 * 2 - Teusday
 * 
 * don't forget to put brreak keyword in switch statement
 * 
 * 
 * 
 * NOTE: Switch is used to switch between the ports
 * Every 6 months, a new java version is released
 */