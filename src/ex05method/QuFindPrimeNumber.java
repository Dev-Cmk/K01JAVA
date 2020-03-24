package ex05method;

public class QuFindPrimeNumber {
	static boolean isPrimeNumber(int num) {
		if(num==1) {
			//1은 소수가 아니므로 무조건 false를 반환한다.
			return false;
		}
		else {
			/*
			모든 자연수는 1과 자신으로 나눠지므로 두 조건을 제외한
			나머지 수로 나눠서 떨어지는지를 판단한다.
			 */
			for(int i=2 ; i<num; i++) {
				/*
				1과 자신을 제외한 숫자로 나눠서 떨어지면 소수가 아니므로
				그 이후는 검사할 필요가 없다. 판단되는 즉시 false를
				반환한다.
				 */
				if(num%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		for(int i=1 ; i<=100 ; i++) {
			if(isPrimeNumber(i)==true) {
				System.out.println("소수="+ i);
			}
		}
	}

}
