public class arr1
{
    public static void main(String args[])
    {
        System.out.println("Program started in main()");

        int nums[] = {3, 7, 4, 2};

        System.out.println(nums[1]); // to print value at index 0 of the array nums
        // index = 0123456...

        nums[1] = 6;

        System.out.println(nums[1]);

        // how to make the array dynamic

        int num[] = new int[4]; // here, an array is created with index 0,1,2,3 and 0 is stored at all the index
        num[0] = 5;
        num[1] = 8;
        nums[2] = 9;
        num[3] = 10;
        System.out.println(num[1]);

        // how to print all the values stored in array
        // we can use a loop to print all the values of array

        for(int i = 0; i < num.length; i++)
        {
            System.out.println("Index " + i + " = " + num[i]);
        }


    }
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */