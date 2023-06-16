package gnani;
class Basics{
	public void AND(int bit1,int bit2) {
		System.out.println(bit1&bit2);
		//AND with 1 gives number
		//AND with 1 gives 0
	}
	public void OR(int bit2,int bit1) {
		System.out.println(bit1|bit2);
		
	}
	public void XOR(int bit1,int bit2) {
		System.out.println(bit1^ bit2);
		//a XOR 1=complement of a 
		//a XOR 0=gives a
		//a XOR a=0
		System.out.println("1"+(bit1^1));
		System.out.println("2"+(bit1^0));
		System.out.println("3"+(bit1^bit1));
	}
	public void complement(int bit) {
		System.out.println(~bit);
	}
}
class ithBit{
	public int index(int num,int ind) {
		int x=1<<(ind);
		return num&x;
	}
}
public class NumberSystemPractice {

	public static void main(String[] args) {
		int x=5^1^6;
		System.out.println(x);
	}

}
