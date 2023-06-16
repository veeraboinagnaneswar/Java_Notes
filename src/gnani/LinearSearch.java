package gnani;

import java.util.Arrays;

class LS{
	//to print the index value
	public int linearSear(int[]arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	//to print the element using the enhanced for loop 
	//hear -1 may be the element so we will print the max element of integer
	
	public int linearSearch2(int[] arr,int target) {
		if(arr.length==0) {
			return Integer.MAX_VALUE;
		}
		for(int element :arr) {
			if(element ==target) {
				return element;
			}
		}
		return Integer.MAX_VALUE;
	}
	//return  true or false
	public boolean linearSearch3(int[] arr,int target) {
		if(arr.length==0) {
			return false;
		}
		for(int element :arr) {
			if(element ==target) {
				return true;
			}
		}
		return false;
	}
	//search the char in the string 
	public boolean LinearSearch4(String str,char target) {
		if(str.length()==0) {
			return false;
		}
		for(char ch:str.toCharArray()) {
			if(ch==target) {
				return true;
			}
		}
		return false;
	}
	
}
class StartEnd{
	public int inRange(int[] arr,int target,int start,int end) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=start;i<end;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
class MinMaxElem{
	public int minElem(int[]arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
}
class Search2D{
	public void twoD(int[][]arr,int target){
		if(arr.length==0&&arr[0].length==0) {
			System.out.println(-1);;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					System.out.println(i+" "+j);
				}
			}
		}
		
	}
	//returning an array
	public int[] two2D(int[][]arr,int target) {
		if(arr.length==0&&arr[0].length==0) {
			return new int[] {};
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					return new int[] {i+1,j+1};
				}
			}
		}
		return new int[] {};
	}
	//min and max in the 2d array
	public int minElem(int[][]arr) {
		int min=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(min>arr[i][j]) {
					min=arr[i][j];
				}
			}
		}
		return min;
	}
	public int maxElem(int[][]arr) {
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
		}
		return max;
	}
}
public class LinearSearch {

	public static void main(String[] args) {
		int[]arr= {20,30,40,50,1,2,3,45};
		int target=2;
		LS l=new LS();
		StartEnd se=new StartEnd();
		//System.out.println(l.LinearSearch4("Gnani", 'i'));
		//System.out.println(se.inRange(arr, target, 1, 6));
		MinMaxElem mm=new MinMaxElem();
	//	System.out.println(mm.minElem(arr));
		int[][]arr1= {
				{1,2,3},
				{12,11},
				{10,20,30},
				{19,40,50}
		};
		Search2D s=new Search2D();
		/*s.twoD(arr1,target);
		int[]ar=s.two2D(arr1, target);
		System.out.println(Arrays.toString(ar));
		*/
		int min=s.minElem(arr1);
		System.out.println(min);
		int max=s.maxElem(arr1);
		System.out.println(max);
		String x=Integer.toString(10);
		System.out.println(x.length());
	}
	

}
