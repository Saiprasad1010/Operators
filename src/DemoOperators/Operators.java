package DemoOperators;

public class Operators {

	static void unray() {
		int a=10,b=15;
		System.out.println(--a - ++b + a--);  //9 - 16 + 9
		
	}
	
	static void unray1() {
		int a=12,b=10,c=16,d=13;
		System.out.println(++a + b-- * ++c - --d + a++ - c--);  // 13+10*17-12+12-16
		System.out.println(--c * a-- / c++ + d-- - a++ + b-- - --b + d++ );  // 15*12/16+13-12+10-8+12
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		unray();
		unray1();
		
	}

}
