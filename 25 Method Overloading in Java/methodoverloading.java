class Calculator
{
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public double add(double n1, double n2)
    {
        return n1 + n2;
    }

}


public class methodoverloading  {
    public static void main(String args[])
    {
        System.out.println("Program started here in main()");

        // creating an object
        Calculator obj = new Calculator();
        int r1 = obj.add(3., 4);
        System.out.println(r1);



    }
}
/*
 * We can have same method name with different number of parameters
 * We can also have same method name with different return type
 * This is called Method overloading
 * 
 * Method Overriding:
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */