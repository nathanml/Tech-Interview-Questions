package ArrayReverse;
import java.util.Arrays;

public class ArrayReverse{

	public static int[] reverseArray(int[] arr)
	{
		int[] ret = new int[arr.length];
		int i = arr.length - 1;
		while(i >= 0)
		{
			ret[i] = arr[i];
			i--;
		}
		return ret;
	}
	public static void main(String[] args) {
		int[] array1 = {1};
		System.out.println(Arrays.toString(reverseArray(array1)));
		int[] array2 = {1,2,3,4,5};
		System.out.println(Arrays.toString(reverseArray(array2)));		
		int[] array3 = {5,4,3,2,1};
		System.out.println(Arrays.toString(reverseArray(array3)));
		int[] array4 = {};
		System.out.println(Arrays.toString(reverseArray(array4)));
	}

}