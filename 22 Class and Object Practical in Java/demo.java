class Calculator
{
    int a;

    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}



public class demo
{
    public static void main(String[] args) 
    {
        System.out.println("Program started");
        int num1 = 4;
        int num2 = 5;

        // how to make an object
        Calculator calc = new Calculator();

        // how to call add() method from Calculator class
        int result = calc.add(num1, num2);

        // printing the returrn value add() method
        System.out.println(result);
    }
    
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 */