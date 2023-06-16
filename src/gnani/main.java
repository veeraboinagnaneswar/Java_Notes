package gnani;
import java.util.*;
import java.math.*;
import java.io.*;

public class main {
	public static void main(String[] args)  {
		int[]arr= {19,40,50,13,23,44};
		int target=23;
		int x=linearSearch(arr,target);
		System.out.println(x);
	}
	public static int linearSearch(int[]arr ,int target) {
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
}