package debugging;

import java.util.Arrays;

public class Debugging {

    public static void main(String[] args)
    {
        int value = 42;
        String message = "The value is: " + value;
        System.out.println(message);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i * 2;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
