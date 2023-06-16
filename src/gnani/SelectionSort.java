package gnani;
import java.util.*;
class SS{
	public void sort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1;
			int maxIn=maxIndex(arr,0,last);
			swap(arr,maxIn,last);
		}
	}
	public void swap(int[]arr,int in,int ln) {
		int temp=arr[in];
		arr[in]=arr[ln];
		arr[ln]=temp;
	}
	public static int maxIndex(int[]arr,int start,int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}
}

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2};
		SS s=new SS();
		s.sort(arr);
		System.out.print(Arrays.toString(arr));
	}

}
