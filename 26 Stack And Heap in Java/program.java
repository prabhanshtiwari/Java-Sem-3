class Calculator
{
    // here num is instance variable
    int num;

    public int add(int n1, int n2)
    {
        // here n1 and n2 is local variable
        return n1 + n2;
    }
}

public class program {
    public static void main(String[] args) {
        System.out.println("Program started in main");

        int data = 10;

        Calculator obj = new Calculator();
        int r1 = obj.add(4, 5);
        System.out.println(r1);



    }
}
/*
 * JVM = Stack + Heap
 * JVM contains Stack Memory and Heap memory
 * 
 * Local Variable:
 * 
 * Every method will have its own stack.
 * Stack wil have key-value pairs
 * 
 * 
 * 
 * 
 * 
 * 
 */