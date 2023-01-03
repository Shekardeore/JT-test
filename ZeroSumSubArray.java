package JTtest;

import java.util.Scanner;

public class ZeroSumSubArray {
	static int subarray(int arr[], int n) {
		int currentsum, i, j;
		 int sum=0;
		for (i = 0; i < n; i++) {
			currentsum = arr[i];
			for (j = i + 1; j <= n; j++) {
				if (currentsum == sum) {
					int p = j - 1;
					
					for(int k =i;k<=p;k++) {
						System.out.println(arr[k]+",");
					}
					return 1;
				}
				if (currentsum > sum || j == n)
					break;
				currentsum = currentsum + arr[j];
			}
		}

		System.out.println(" No Elemets found ");
		return 0;
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number of elements :  ");
		n = sc.nextInt();
		int[] array = new int[100];
		System.out.println(" Enter elements of the array :  ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		subarray(array, n);
	}
}

//https://codeshare.io/OdPwQx