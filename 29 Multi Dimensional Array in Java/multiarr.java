public class multiarr
{
    public static void main(String args[])
    {
        System.out.println("Program started in main()");

        
        int nums[][] = new int[3][4]; // creation of multi-dimensional array

        // Assigning values in multi-dimensional array at it's all indices

        for(int i = 0; i < 3; i++)
        {
            // random function returns value in double
            for(int j = 0; j < 4; j++)
            {
                nums[i][j] = (int)(Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // printing all the values of the multi-dimensional array
        // here, i -> row and j -> colums
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print("Element at index " + i + j + " = " + nums[i][j] + " ");
            }
            System.out.println();
        }


        // Enhanced for loop

        for(int n[] : nums)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
/*
 * 
 * to combine multiple array
 * array of arrays = multi-dimentional array
 * 
 * 
 * 
 * 
 * 
 * 
 */