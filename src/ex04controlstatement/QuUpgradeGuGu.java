package ex04controlstatement;

/*
아래와 같은 출력결과를 보이는 업그레이드 구구단 프로그램을 작성하시오.
Class Name : QuUpgradeGuGu.java
---------- java ----------
2 x 1 = 2
2 X 2 = 4
2 X 2 X 2 = 8
2 X 2 X 2 X 2 = 16
2 X 2 X 2 X 2 X 2 = 32
2 X 2 X 2 X 2 X 2 X 2 = 64
2 X 2 X 2 X 2 X 2 X 2 X 2 = 128
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 256
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 512
3 X 1 = 3
3 X 3 = 9
3 X 3 X 3= 27
………중간 생략………
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 43046721
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 387420489
출력 완료 (0초 경과) - 정상 종료
*/

//[방법1]
public class QuUpgradeGuGu {

	public static void main(String[] args) {
		for(int i=2 ; i<=9; i++) {
			for(int j=1 ; j<=9 ; j++) {
				System.out.print(i);
				if(j==1) 
					System.out.printf(" X %d",j);
				else {
						for(int k=2; k<=j; k++) {
							System.out.printf(" X %d",i);
						}
				}
				System.out.printf(" = %d\n",gugu(i,j));
			}
			
		}
	}
	
	static int gugu(int num1,int num2) {
		int res=num1;
		if(num2==1) {
			res = num1 * num2;
		}
		else if(num2>1){
			for(int i=2; i<=num2; i++) {
				res = res*num1;
			}
		}	
		return res;
	}
}

/*
[방법2]
public class QuUpgradeGuGu {

	public static void main(String[] args) {
		for(int dan=2 ; dan<=9 ; dan++) {
				
			for(int su=1 ; su<=9 ; su++) {
				System.out.printf("%d ",dan);
				int i = 1;
				
				if(su==1) {
					System.out.printf("X %d ",su);
					i=i*dan;
				}
				else {
					for(int res=1 ; res<su; res++) {
					
						System.out.printf("X %d ",dan);
						i=i*dan;
					}
					i=i*dan;
				}
				System.out.printf("= %d\n",i);
			}
		}
	}
}
*/
