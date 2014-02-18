package find.max.number;

public class FindMaxNumber {
	public int max(int a, int b) {
		int as = sign(a);
		int bs = sign(b);
		int abs = sign(a-b);
		abs = (as^bs&as) | ((0x1^as^bs)&abs);
		
		return (0x1^abs)*a + abs*b;
	}
		private int sign(int a) {
		return (a >>> 31);
	}
}
