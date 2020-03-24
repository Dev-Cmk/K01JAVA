package ex08class;

public class Car {

	//[멤버상수]
	public static final String AUTO = "자동";
	public static final String MANUAL = "수동";
	
	//[멤버변수]
	String carGear = AUTO; //미션
	String carModel; //모델명
	int carYear; //연식
	Human owner;/*
		소유주 : Human클래스를 기반으로 하는 멤버변수로
			초기화를 위해 이름, 나이, 에너지 3가지의 값이 필요하다.
			클래스를 구성할때 또다른 객체를 멤버변수로 선언할 수 있다.
	 	*/
	
	//멤버메소드
	void drive() {
		System.out.println(owner.name +"이(가) "+ carModel
				+"을 운전한다.");
	}
	
	/*
	객체의 초기화를 담당하는 메소드로 아래는 항상 같은 값으로만
	초기화 한다는 한계를 가지고 있다.
	 */
	void initialize() {
		carModel = "람보르기니";
		carYear = 2017;
		owner = new Human();
		owner.name = "캡틴로져스";
		owner.age = 30;
		owner.energy = 10;
	}
	
	/*
	위와 동일한 이름의 함수로 오버로딩에 의해 정의되었다.
	초기화를 진행하는 역할은 동일하나, 매개변수를 통해
	다양한 형태의 객체를 초기화할 수 있다.
	 */
	void initialize(String model, int year, String name,
			int age, int energy) {
		carModel = model;
		carYear = year;
		owner = new Human();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}
	
	//해당 객체의 정보를 디스플레이 함
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명:%s\n", carModel);
		System.out.printf("연식:%d\n", carYear);
		System.out.printf("기어:%s\n", carGear);
		owner.showState();
	}
}//end of Car Class
