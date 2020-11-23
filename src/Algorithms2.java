

public class Algorithms2 {
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		System.out.print(" "+number1+", "+number2+", ");
		int sum = number1+number2;
		for (int i = 0; i<10; i++) {
			

			System.out.print(" "+sum+", ");
			number1=number2;
					number2=sum;
					sum=number1+number2;

		}
	}
}
// 0  1  1
// n1 n2 s
//    n1 n2 sum  hi!