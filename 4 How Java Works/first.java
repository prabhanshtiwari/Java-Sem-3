
public class first {
    public static void main(String a[]) {
        System.out.println("Hi");
    }
}

/*
 * Inside Computer System, We have JVM(Java Virtual Machine)
 * JVM Works on Operating System
 * JVM will not accept the code directly
 * JVM doesn't understand the code written in High Level Language
 * 
 * Java is Platform Independent but JVM is needed to run that program.
 * JVM is platform dependent. It is build for particular OS.
 * But JVM understands Bytecode
 * For this .java (source) file is converted into .class file called Bytecode
 * javac compiler converts java file into bytecode
 * 
 * The java file should have main() 
 * public static void main(String a[])
 * or 
 * public static void main(String[] args)
 * 
 * Java provides JRE(Java Runtime Environment)
 * It is outer layer of JVM
 * JRE = JVM + Libraries
 * 
 * JDK > JRE > JVM
 * 
 * Java os WORA(Write once, run anywhere)
 */