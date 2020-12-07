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
		for(int h = 0; h<=2; h++) {
			for(int h2 = 0; h2<=2; h2++) {
				System.out.println(h+" "+h2);

			}
		}
		System.out.println();
		for(int i = 1; i<=9; i++) {
			System.out.print(i);
			if(i % 3 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		int i4 = 1;
		for(int i2 = 0; i2<=2; i2++) {
			for(int i3 = 0; i3<=2; i3++) {
				System.out.print(i4);
				//					if(i4 % 3 == 0) {
				//						System.out.println();
				//					}
				i4++;
			}
			System.out.println();
		}
		System.out.println();
		int j = 1;
		for(int j1 = 0; j1<=9; j1++) {
			for(int j2 = 0; j2<=9; j2++) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
		}
		for(int k = 1; k<=6; k++) {
			for(int l = 1; l<=k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
