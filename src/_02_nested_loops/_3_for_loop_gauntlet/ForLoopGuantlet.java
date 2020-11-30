package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGuantlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 0; a<101; a++) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int b = 100; b>=0; b--) {
			System.out.print(b+" ");
		}
		System.out.println();
		for(int c = 2; c<101; c=c+2) {
			System.out.print(c+" ");
		}
		System.out.println();
		for(int d = 1; d<100; d=d+2) {
			System.out.print(d+ " ");
		}
		System.out.println();
		for(int e = 1; e<=10; e++) {
			if(e % 2 == 0) {
				System.out.print(e+" is even, ");
			}
			else {
				System.out.print(e+" is odd, ");
			}
		}
		System.out.println();
		for(int f = 7; f<56; f+=7) {
			System.out.print(f+" ");
		}
		System.out.println();
		for(int g = 2005; g<=2020; g++) {
			System.out.print("in the year "+g+" i was "+(g-2005)+", ");
			if ((g-2005) % 4 == 0)
				System.out.println();
		}
		System.out.println();
		
	}

}
