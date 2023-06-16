package gnani;

import java.util.Arrays;
import java.util.Scanner;

class BuSor{
	public int[] bSort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		return arr;
	}
}

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		BuSor bs=new BuSor();
		int[]a=bs.bSort(arr);
		System.out.println(Arrays.toString(a));
	}

}
