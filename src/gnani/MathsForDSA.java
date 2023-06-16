package gnani;
import java.util.*;
class Prime{
	//to check weather a number is prime or not using while loop
	public boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		int c=2;
		while(c*c<=n) {
			if(n%c==0) {
				return false;
			}
			c++;
		}
		return true;
	}
	//using for loop
	public boolean isPrimefor(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
class Seive{
	public void seivePrime(int n,boolean[] primes) {
		for(int i=2;i*i<=n;i++) {
			if(primes[i]==false) { // we can add the !primes[i] it is also same as the primes[i]==false
				for(int j=i*2;j<=n;j+=i) {
					primes[j]=true;
				}
			}
		}
		for(int i=2;i<primes.length;i++) {
			if(primes[i]==false) {
				System.out.println(i);
			}
		}
	}
}
class OwnSqrt{
	public int perfectSqrt(int n) {
		int start=0;
		int end=n;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid*mid==n) {
				return mid;
			}
			else if(mid * mid>n) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
	public double notPerfectSquare(int n,int p) {
		int start=0;
		int end=n;
		double root=0.0;
//		while(start<=end) {
//			int mid=start+(end-start)/2;
//			if(mid*mid==n) {
//				return mid;
//			}
//			if(mid*mid>n) {
//				end=mid-1;
//			}
//			else {
//				start=mid+1;
//			}
//		}
		double inc=0.1;
		for(int i=0;i<p;i++) {
			while(root*root<=n) {
				root+=inc;
			}
			root-=inc;
			inc/=10;
		}
		return root;		
	}
}
public class MathsForDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		Prime p=new Prime();
//		System.out.println(p.isPrime(n));
//		System.out.println(p.isPrimefor(n));
//		for(int i=0;i<=n;i++) {
//			if(p.isPrime(i)) {
//				System.out.println(i);
//			}
//		}
//		boolean[]prime=new boolean[n+1];		
//		Seive s=new Seive();
//		s.seivePrime(n,prime);
		OwnSqrt os=new OwnSqrt();
		System.out.print(os.notPerfectSquare(n, 3));
	}

}
