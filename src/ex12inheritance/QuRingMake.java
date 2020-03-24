package ex12inheritance;

class Point
{
   	int xDot, yDot;
   	public Point(int x, int y)
   	{
         		xDot=x;
         		yDot=y;
   	}
   	public void showPointInfo()
   	{
         		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	//생성자
	/*
	반지름을 표현하는 radian과 중심좌표를 표현한 Point객체 생성
	Point객체 생성을 위해서는 2개의 인자가 필요
	 */
	public Circle(int x,int y,int radian) {
		this.radian = radian;
		center = new Point(x, y);
	}
	public void showCircleInfo() {
		System.out.println("반지름 :"+ radian);
	}
	
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	public Ring(int inx,int iny,int in_radian,int oux,int outy,
			int out_radian) {
		super();
		this.innerCircle = new Circle(inx,iny,in_radian);
		this.outerCircle = new Circle(oux,outy,out_radian);
	}
	
	public void showRingInfo() {
		System.out.println("안쪽원의 정보:");
		innerCircle.showCircleInfo();
		innerCircle.center.showPointInfo();
		System.out.println("바깥쪽원의 정보:");
		outerCircle.showCircleInfo();
		outerCircle.center.showPointInfo();
	}
}
class QuRingMake {
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}
