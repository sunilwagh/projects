package practice.projects;

import java.util.Arrays;

/**
 * 
 * Merge two sorted arrays in to third.
 *
 */

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] data1 = { 10, 20, 30, 40, 50, 60, 71, 80, 90, 91 };
		int[] data2 = { 1, 20, 33, 40, 50, 60, 75, 79 };
		System.out.println("Merged Sorted Array" + Arrays.toString(merge(data1,data2)));
	}

	private static int[] merge(int[] data1, int[] data2) {

		int data1_length = data1.length;
		int data2_length = data2.length;

		int count = 0;
		int[] data3 = new int[data1_length + data2_length];

		int i = 0;
		int j = 0;

		while (i < data1.length && j < data2.length)

		{
			if (data1[i] < data2[j])

			{
				data3[count] = data1[i];
				count++;
				i++;
			} else {
				data3[count] = data2[j];
				count++;
				j++;
			}

		}

		while (i < data1.length) {
			data3[count] = data1[i];
			count++;
			i++;
		}

		while (j < data2.length) {
			data3[count] = data2[j];
			count++;
			j++;
		}

		return data3;
	}

}
