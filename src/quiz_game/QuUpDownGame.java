package quiz_game;

import java.util.Scanner;

/*
 *게임설명 : 업다운게임을 메소드를 이용해 구현한다.
1. 컴퓨터는 1~100사이의 숫자 하나를 생성한다.
2. 총 시도횟수는 7번을 부여한다.
3. 사용자는 7번의 시도안에 숫자를 맞춰야 한다.
4. 사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
5. 7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
6. 성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
7. 함수를 사용하여 구현한다.
8. 무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.

 */
public class QuUpDownGame {
	
	private static int comNum; //임의의 컴퓨터 숫자 저장을 위한 변수
	private static int useNum; //사용자의 입력값
	private static int cnt=0; //반복을 위한 변수
	private static int reStart; //재시작을 위한 변수
	static Scanner sc = new Scanner(System.in); //사용자입력값 받기위한 변수
	private static boolean res = true; //재시작을 위한 논리변수
	
	public static void makeComNum(){
		comNum = (int)((Math.random()*100) % 100) + 1;
		System.out.println("컴퓨터의 임의의 숫자 생성");
		System.out.println(comNum);
	}//end of makeComNum method
	
	public static void makeUserNum() {
		if(cnt<7) {
			System.out.println("사용자 숫자입력:");
			useNum = sc.nextInt();
		}
	}
	
	public static void restartGame() {
		while(true) {
			System.out.println("게임을 계속 하시겠습니까?(재시작 : 1 , 종료 : 0)");
			reStart = sc.nextInt();
				if(reStart == 1) {
					res = true;
					break;
				}
				else if(reStart == 0) {
					res = false;
					break;
				}
				else
					continue;
				}
		}
	
	public static void startGame() {
		while(res) {
			cnt = 0;
		while(cnt < 7) {
			makeUserNum();
			if(comNum > useNum) {
				System.out.println("컴퓨터의 숫자가 더 높습니다.(Up)");
				cnt++;
			}
			else if(comNum < useNum){
				System.out.println("컴퓨터의 숫자가 더 낮습니다.(Down)");
				cnt++;
			}
			else {
				System.out.println("컴퓨터의 숫자와 일치합니다.");
				break;
			}
		}//end of while(총 시도횟수에 대한 반복)
			if(comNum == useNum) {
				System.out.println("성공");
				restartGame();
			}
			else {
			System.out.println("실패");
			restartGame();
			}
		}//end of while(게임 재시작을 위한 반복)
	}//end of startGame method
	public static void main(String[] args) {
		makeComNum();
		startGame();
		
	}//end of main
	
}//end of class
