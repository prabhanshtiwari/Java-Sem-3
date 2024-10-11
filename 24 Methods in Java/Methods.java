class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing");

    }

    public String getMeAPen(int cost)
    {
        if (cost >= 10)
        {
            return "Pen";
        }
        return "Nothing";
        
    }
}



public class Methods
{
    public static void main(String args[])
    {
        System.out.println("Program Started in main()");

        // make an object
        Computer obj = new Computer();

        obj.playMusic();

        String str = obj.getMeAPen(9);
        System.out.println(str);


    }
}
/*
 * execution stops at return keyword
 * 
 * 
 * 
 * 
 * 
 */