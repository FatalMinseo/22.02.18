
public class PhoneMain {

	public static void main(String[] args) {
		// static 클래스가 동시다발적으로 활성화

		// Phone 클래스 사용
		// 클래스명 객체명(변수명) = new Phone();
		// 생성자 변수가 가지고 있는 성질/타입
		Phone iPhone = new Phone(30, "22222");
		iPhone.pnumber="22222";
		iPhone.displaySize=30;
		System.out.println(iPhone.pnumber);
		iPhone.Camera();

		Phone galaxy = new Phone(50, "11111111");
		galaxy.pnumber = "1111111";
		galaxy.displaySize = 50;

		Phone lollipop = new Phone(10, "011");
		lollipop.pnumber="011";
		lollipop.displaySize=10;
		
	}

}
