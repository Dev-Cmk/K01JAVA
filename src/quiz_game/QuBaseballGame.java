package quiz_game;
/*
 * 게임설명 : 야구게임을 메소드를 이용하여 구현한다.
1. 중복되지 않는 3개의 정수를 생성한다.(1~9)
2. 사용자는 3개의 숫자를 입력한다.
3. 생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
4. 숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
5. 숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
6. 숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
7. 3 strike 가 되면 게임은 종 료된다.
8. 시도한 횟수를 표시한다.
9. 계속할지 종료할지 여부를 물어보고 다음 진행을 한다.

위 문제의 변수들을 배열을 이용하여 구현해본다.
   int com1, com2, com3; -> int[] com = new int[3];
   int user1, user2, user3; -> int[] user = new int[3]; 
3개의 난수를 생성하는 부분과 스트라이크, 볼을 판정하는 부분은 배열을 이용한 로직으로 변경해야 한다.

 */
import java.util.Scanner;

public class QuBaseballGame {

	private static int[] com = new int[3]; //컴퓨터 수 저장 배열
	private static int[] user = new int[3]; //사용자입력값 저장 배열
	private static Scanner sc = new Scanner(System.in); //사용자입력값
	private static int strike, ball, out=0; //스트라이크, 볼 , 아웃 누적횟수값
	private static int num; //시도한횟수
	private static boolean result = true; //게임시작여부를 위한 변수
	private static boolean restart = true; //게임재시작여부를 위한 변수
	
	
	//중복되지 않는 3개의 정수 생성
	public static void make_comNum(){
		for(int i=0 ; i<3 ; i++)
		{
			com[i] = (int)((Math.random()*100) % 9) + 1;
			for(int j=0 ; j<i ; j++)
			{
				if(i!=j && com[i]==com[j])
				{
					i--;
				}
			}
		}
		for(int k=0 ; k<3 ; k++)
		{
			System.out.print(com[k]+" ");
		}
		System.out.println();
	}
	
	//사용자의 3개의 숫자 생성
	public static void make_userNum() {
		System.out.print("사용자의  숫자 3개 입력");
		for(int i=0 ; i<3 ; i++)
		{
		user[i] = sc.nextInt();
		}
	}
	
	public static void startGame() {
		make_userNum();
		while(result) {
			strike = 0;
		//스트라이크, 볼판정
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				if(i==j)
				{
					if(com[i] == user[j])
					{
						strike++;
					}
					else if(com[i] != user[j])
					{
						ball++;
					}
				}
				else if(i!=j)
				{
					if(com[i] == user[j])
					{
						ball++;
					}
					else if(com[i] != user[j])
					{
						ball++;
					}
				}
				
			}//end of for2
		}//end of for1
		num++;
		if(strike==1)
		{
			System.out.println(strike+"스트라이크"+" 2볼");
		}
		else if(strike==2)
		{
			System.out.println(strike+"스트라이크"+" 1볼");
		}
		//3스트라이크시 게임 종료
		else if(strike==3)
		{
			result = false;
			System.out.println("모두일치하므로 종료");
			continue;
		}//end of if
		
		//모두불일치시 아웃
		else if(ball==9)
		{
			System.out.println("아웃");
		}
		restartGame();
		if(restart == false)
		{
			result = false;
		}
		}//end of while
		
	}
	
	public static void restartGame() {
		System.out.println("시도한 횟수: "+ num );
		System.out.println("게속게임을 하시겠습니까? 계속(0) 종료(1) 입력");
		int res = sc.nextInt();
		if(res == 0)
		{
			restart = true;
		}
		else
		{
			restart = false;
		}
		while(restart)
		{
			startGame();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("야구게임시작");
		make_comNum();
		startGame();
	}

}
