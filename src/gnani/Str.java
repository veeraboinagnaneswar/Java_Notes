package gnani;
import java.util.*;
class Strrr{
	public void get() {
//		String a="gnani";
//		System.out.println(a);
//		String b="gnani";
//		System.out.println(a==b);
//		String c="gnani";
//		String d=new String("gnani");
//		System.out.println(c==d);
//		System.out.println(c.equals(d));
//		System.out.println(d.equals(a));
//		System.out.println('a'+'b');
//		System.out.println((char)((char)'a'+(char)'b'));
//		System.out.println((char)'a');
//		System.out.println("a"+"b");
//		System.out.printf("Hi! My self %s and i am %s",a,"cool");
//		System.out.println();
//		System.out.printf("round to %.2f",2.1163);
//		System.out.println();
//		System.out.println(Arrays.toString(new int[] {1,2,3,4,5}));
//		System.out.println("a"+1);//here 1 is converted to Wrapper class Integer 
		
//		String x="";
//		for(int i=0;i<26;i++) {
//			char ch=(char)('a'+i);
//			//System.out.println(ch);
//			x=ch+x;//here we are getting the wasting of the memory 
//			//for every iteration we are creating a new object			
//		}
//		System.out.println(x);
//		
//		String a="gnani";
//		String b=new String("gnani");
//		b.intern();
//		System.out.println(a==b);
		String a="abcyba";
//		int start=0;
//		boolean b=true;
//		int end=a.length()-1;
//		while(start<=end) {
//			if(a.charAt(start)!=a.charAt(end)) {
//				b=false;
//				break;
//			}
//			else {
//				start++;
//				end--;
//			}
//		}
//		System.out.println(b);
	}
}
public class Str {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*String s="sachin";
		s.concat("tendulakar");
		System.out.println(s);
		
		Here we are concatinating the two stings but we are getting the out put as sachin becaue strings are 
		
		immutable in java the changes will not done on the same object 
		
		
		*/
		/* StringBuilder sb=new StringBuilder("Gnani");
		sb.append("veeraboina ");
		System.out.println(sb);
		
		=> here we are using stringbuilder but this are mutable in nature so the changes are done 
		in the same object
		
		*/
		/*String s=new String("gnani");
		String s1=new String("gnani");
		System.out.println(s==s1); =>this will compare the objects 
		System.out.println(s.equals(s1));=>here this will compare the content of the object 
		*/
		/*
		StringBuilder sb=new StringBuilder("Gnani");
		StringBuilder sb1=new StringBuilder("Gnani");
		System.out.println(sb.equals(sb1));=>here this will compare the content but the string builder class 
		does not overridden  the equlas method
		
		System.out.println(sb==sb1);=>here it will give the false because two objects ;
		
		*/
		/* here the object is created in the same place called String concanate pool
		String s="gnani";
		String s1="gnani";
		System.out.println(s==s1);
		so it will give correct one 
		
		*/
		/* here one is created in the String concatination pool and another one is created in the heap area 
		 * So it will give false 
		 * String s=new String ("Gnani");
		   String s1="Gnani";
		   System.out.println(s==s1);
		   
		 */
		/*
		String s=new String("gnani");
		String s1=new String("veeraboina");
		String s2="gnani";
		String s3="veeraboina ";
		here the two objects that are s and s1 are created in the scp area and another two s2 and s3 are created in the 
		String concatination Pool .
		
		*/
		/* 
		String s=new String ("Gnani");
		s.concat(" Veeraboina ");
		s=s.concat("gnani");
		s="veeraboina gnaneswar";
		System.out.println(s);
		this all the things can be done in the SCP(String 
		*/
//		
//		String s=sc.next();
//		String s1=sc.next();
//		System.out.println(s.length()+" "+s1.length());
//		//Logic for this 
//		
//		int sum=0,sum1=0;
//		for(int i=0;i<s.length();i++) {
//			sum++;
//		}
//		for(int i=0;i<s1.length();i++) {
//			sum1++;
//		}
//		
//		System.out.println(sum+" "+sum1);
//		
//		System.out.println(s.concat(s1));
//		String s2=s;
//		for(int i=0;i<s1.length();i++) {
//			s2+=s.charAt(i);
//		}
//		System.out.println(s2);
//		
//		System.out.println(s1.toUpperCase());
//		System.out.println(s.toUpperCase());
		
//		Scanner sc=new Scanner(System.in);
//		String s=new String("gnani");
//		String s0=new String("gnani");
//		System.out.println(s==s0);//false 
//		String s1="gnani";
//		String s2="gnani";
//		System.out.println(s1==s2);//true
//		System.out.println(s1==s);//false 
		
//		String s=new String("gnani");
//		String s1=s.intern();//this helps to integrate the string 
//		//in object string in the SCP area
//		String s2="gnani";
//		System.out.println(s2==s1);
		
//		String s=new String("gnani");
//		s=s.concat("veeraboina");
//		String s1="gnaniveeraboina";
//		String s2=s.intern();
//		System.out.println(s2==s1);
//		System.out.println(s2==s);
		
//		String s=new String();
//		System.out.println(s);
		
		
		
		
//		List l=new ArrayList();
//		List l1=new LinkedList();
//		List l2=new Vector();
//		List l3=new Stack();
//		LinkedList l4=new LinkedList();
//		ArrayList l5=new ArrayList();
//		Vector v=new Vector();
//		Stack s=new Stack();
		
		
		
	}

}
