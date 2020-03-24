package ex08class;

public class E03CarMain {

	public static void main(String[] args) {
		
		//자동차1 객체 생성
		Car car1 = new Car();
		System.out.println("[초기화메소드 호출전]");
		System.out.println("car1.owner="+ car1.owner);
		//car1.drive(); 
			 /*	에러발생(자동차 소유주를 표현하는
				Human객체가 초기화 되지 않은상태에서
				출력을 시도하여 에러가 발생된다.) 
			 */
		
		System.out.println("[초기화메소드 호출후]");
		car1.initialize(); //고정된 내용으로 초기화된다.
		car1.drive();
		car1.showCarInfo();
		
		//자동차2 객체 생성 : 객체생성후 멤버변수를 직접 접근하여 초기화한다.
		Car car2 = new Car();
		car2.carGear = Car.MANUAL;
		car2.carModel = "밴틀리";
		car2.carYear = 2018;
		
		car2.owner = new Human();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		
		System.out.println("자동차정보와 소유자정보 같이보기");
		car2.showCarInfo();
		
		//세번째 자동차 객체생성 : 매개변수가 있는 초기화 메소드를 이용하여 초기화
		Car car3 = new Car(); //객체생성
		car3.initialize("스포츠카", 2012, "성유겸", 8 ,10); //초기화
		car3.showCarInfo(); //정보출력
		
	}

}
