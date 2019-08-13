package MaxMinMethods;
//Finds maximum and minimum element in unsorted array

import java.lang.reflect.Array;

public class MaxandMin {
	
	public static int maxElement(int[] arr)
	{
		int max = -1000000;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	
	public static int minElement(int[] arr)
	{
		int min = 1000000;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5};
		System.out.println(maxElement(a1)); //expected 5
		System.out.println(minElement(a1)); //expected 1
		int[] a2 = {5,4,3,2,1};
		System.out.println(maxElement(a2)); //expected 5
		System.out.println(minElement(a2)); //expected 1
		int[] a3 = {3,1,2,5,4};
		System.out.println(maxElement(a3)); //expected 5
		System.out.println(minElement(a3)); //expected 1
		int[] a4 = {1,-1,2,-4};
		System.out.println(maxElement(a4)); //expected 2
		System.out.println(minElement(a4)); //expected -4
	}

}
