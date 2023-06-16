package gnani;
import java.io.PrintStream;
import java.util.*;

//class Solution {
//    public int  minBitFlips(int start, int goal) {
//        int count=0;
//        String s=Integer.toBinaryString(start);
//        String g=Integer.toBinaryString(goal);
//        int n=Math.max(s.length(), g.length());
//        if(n!=s.length()) {
//        	s=String.join("",Collections.nCopies(n-s.length(),"0") )+s;
//        }
//        if(n!=g.length()) {
//        	g=String.join("",Collections.nCopies(n-g.length(),"0") )+g;
//        }
//        for(int i=0;i<n;i++) {
//        	if(s.charAt(i)!=g.charAt(i)) {
//        		count++;
//        	}
//        }
//        return count;
//    }
//}

//class Solution {
//    public String sortSentence(String s) {
//        String[] s1=s.split(" ");
//        String x="";
//        HashMap<Integer,String> hm=new HashMap<>();
//        for(int i=0;i<s1.length;i++) {
//        	int a=Integer.parseInt(s1[i].substring(s1[i].length()-1,s1[i].length()));
//        	String b=s1[i].substring(0, s1[i].length()-1);
//        	hm.put(a, b);
//        	//hm.put((Integer.parseInt(s1[i].charAt(s1[i].length()-1)), s1[i].substring(0, s1[i].length()-1));
//        }
//        //int a=Integer.parseInt(s1[0].substring(s1[0].length()-1,s1[0].length()));
//        ArrayList<String> al=new ArrayList<>();
//        al.addAll(hm.values());
//        for(String xx:al) {
//        	x=x+xx+" ";
//        }
//        System.out.println(x);
//        return Arrays.toString(s1);
//        
//    }
//}

//class Solution {
//    public double myPow(double x, int n) {
//        double b=Math.pow(x, n);
//        return b;
//    }
//}

//class Solution11 {
//    public char findTheDifference(String s, String t) {
//        String x=s+t;
//        int res=0;
//        
//        for(int i=0;i<x.length();i++) {
//        	res=res^(int)(x.charAt(i));
//        }
//        return (char)res;
//    }
//}
//
//class Solution 12{
//    public int integerReplacement(int n) {
//        int no=(int)(Math.log(n)/Math.log(2))+1;
//        if((n&1)==0) {
//        	return no-1;
//        }
//        return no+1;
//    }
//}
//class Solution {
//    public void sortByBits(int[] arr) {
//        HashMap<Integer,Integer>hm=new HashMap<>();
//        for(int i=0;i<arr.length;i++) {
//        	hm.put(No(arr[i]),arr[i]);
//        	
//        	
//        }
//        int x=0;
//        Collection<Integer>al=new ArrayList<>();
//        al=hm.values();
//        
//        System.out.println(al);
//    }
//    public int No(int n){
//        int count=0;
//        while(n>0){
//            int l=n&1;
//            if(l==0){
//                count++;
//            }
//            n=n>>1;
//        }
//        return count;
//    }
//}
//
//
//class Solution {
//    public int findMaximumXOR(int[] nums) {
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums.length;j++){
//                int x=nums[i]^nums[j];
//                count=Math.max(count,x);
//            }
//        }
//        return count;
//    }
//}

//class Solution {
//    public void doesValidArrayExist(int[] derived) {
//        int div[]=new int[derived.length];
//        for(int i=0;i<derived.length-1;i++){
//            div[i]=derived[i]^derived[i+1];
//        }
//        div[derived.length-1]=derived[derived.length-1]^derived[0];
//        System.out.println(Arrays.toString(div));
//    }
//}

//class Solution {
//    public int hammingDistance(int x, int y) {
//        int count=0;
//        int x1=(int)(Math.log(x)/Math.log(2))+1;
//        int y1=(int)(Math.log(y)/Math.log(2))+1;
//        for(int i=0;i<Math.min(y1, x1);i++) {
//        	int l=x&1;
//        	int m=y&1;
//        	if(l!=m) {
//        		count++;
//        	}
//        	x=x>>1;
//        	y=y>>1;
//        }
//        if(x!=0) {
//        	for(int i=0;i<x1-y1;i++) {
//        		int l=x&1;
//        		x=x>>1;
//        	if(l==1) {
//        		count++;
//        	}
//        	}
//        }
//        return count;
//        
//    }
//}
class Sort{
	public void bubbleSort(int[]arr) {
		boolean b;
		for(int i=0;i<arr.length;i++) {
			b=false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					b=true;
				}
			}
			if(b==false) {
				break;
			}
		}
	}
}
class NormalBubble{
	public void nBubbleSort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
}
class Select{
	public void sort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-1-i;
			int maxel=max(arr,0,last);
			swap(arr,maxel,last);			
		}
	}
	public int max(int[]arr,int start,int end) {
		int index=start;
		for(int i=start;i<=end;i++) {
			if(arr[i]>arr[index]) {
				index=i;
			}
		}
		return index;
	}
	public  void swap(int[]arr,int in,int ln) {
		int temp=arr[in];
		arr[in]=arr[ln];
		arr[ln]=temp;
	}
}
/*
 * //int n=sc.nextInt();
		//int[]arr= {5,-1,0,4,3,-10,-200};
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();			
//		}
//		Sort s=new Sort();
////		s.bubbleSort(arr);
//		NormalBubble nb=new NormalBubble();
//		nb.nBubbleSort(arr);
//		System.out.println(Arrays.toString(arr));
//		Select s=new Select();
//		s.sort(arr);
//		System.out.println(Arrays.toString(arr));
 */
class rime{
	public boolean isPrime(int n) {
		boolean[]b=new boolean[n+1];
		for(int i=2;i*i<=n;i++) {
			if(b[i]==false) {
				for(int j=i*2;j<=n;j+=i) {
					b[j]=true;
				}
			}
		}
		return b[n];
	}
}
class SQRT{
	public double sqrt(int n,int p) {
		int start=0;
		int end=n;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid*mid==n) {
				return mid;
			}
			if(mid*mid>n) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		double root=0.0;
		double inc=0.1;
		for(int i=0;i<p;i++) {
			while(root*root<=n) {
				root+=inc;
			}
			root -=inc;
			inc=inc/10;
			
		}
		return root;
	}
}

class kanna {	
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		SQRT sq=new SQRT();
		System.out.println(sq.sqrt(n, 3));
	}
}
