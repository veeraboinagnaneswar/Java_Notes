package gnani;
import java.util.*;
class OddrEven{
	public void oddeven(int n) {
		if((n &1)==1) {
			System.out.println("The number is odd");
			
		}
		else if((n&1)==0) {
			System.out.println("The number is even");
		}
	}
}
class Unique{
	public int findUniqueInArray(int[]arr) {
		int unique=0;
		for(int i:arr) {
			unique=unique^i;
		}
		return unique;
	}
}

class FindIthBit{
	public int findBit(int n,int target) {
		int x=1<<target-1;
		return n&x;
	}
}

class MagicNumber{
	public int magicNum(int n) {
		int res=0;
		int base=5;
		while(n>0) {
			int l=n&1;
			res+=base*l;
			base*=5;
			n=n >> 1;
		}
		
		
		return res;
		
	}
	public int magicNum2(int n) {
		int res=0;
		int x=1;
		while(n>0) {
			int last=n&1;
			n=n>>1;
			res+=Math.pow(5, x)*last;
			x++;
		}
		return res;
	}
	
}
class CountBits{
	public int countbits(int n) {
		int count=0;
		while(n!=0) {
			n=n>>1;
			count++;
		}
		return count;
	}
	public int countNum(int n,int base) {
		return (int)(Math.log(n)/Math.log(base))+1;
	}
}

class PasclesTriangle{
	public int nthRowSum(int n) {
		//return 1<<(n-1);
		return (int)Math.pow(2, n-1);
	}
}
class TwoPow{
	public boolean powOfTwo(int n) {
		int count=0;
		while(n>0) {
			int l=n&1;
			if(l==1) {
				count++;
			}
			n=n>>1;
			
		}
		if(count==1) {
			return true;
		}
		return false;
	}
}
class PowerOfAnyNumber{
	public int powOfNumber(int base,int power) {
		int ans=1;
		while(power>0) {
			if((power&1)==1) {
				ans=ans*base;
			}
			base=base*base;
			power=power>>1;
		}
		return ans;
	}
}

class XOR{
	//from 0-->n numbers xor 
	public int  xor(int n) {
		if(n%4==0) {
			return n;
		}
		if(n%4==1) {
			return 1;
			
		}
		if(n%4==2) {
			return n+1;
		}
		return 0;
	}
	//between two limits
	public int xorLimit(int a, int b) {
		int ans=xor(b)^xor(a-1);
		return ans;
	}
}

public class NumberSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int tar=sc.nextInt();
//		int[]arr= {2,3,2,3,4,6,4,2,3,4,3,2,4};
////		OddrEven oe=new OddrEven();
////		oe.oddeven(n);
//		Unique u=new Unique();
//		System.out.println(u.findUniqueInArray(arr));
//		FindIthBit fb=new FindIthBit();
//		int x=fb.findBit(n, tar);
//		System.out.println(x);
//		MagicNumber mn=new MagicNumber();
//		int mg=mn.magicNum(sc.nextInt());
//		System.out.println(mg);
//		System.out.println("2nd method ::"+mn.magicNum2(4));
//		CountBits cb=new CountBits();
//		System.out.println(cb.countNum(2, 2));
//		PasclesTriangle pt=new PasclesTriangle();
//		System.out.println(pt.nthRowSum(4));
//		PowerOfAnyNumber pn=new PowerOfAnyNumber();
//		System.out.println(pn.powOfNumber(3, 6));
		int n=6;
		XOR x=new XOR();
		System.out.println(x.xor(8));
		System.out.println(x.xorLimit(3, 9));
	}

}
