
public class Phone {

	// 버튼갯수
	int btnNum = 12;
	// 화면크기
	int displaySize;
	// 번호
	String pnumber;
	
	// 생성자(메소드 종류)
	// class에 대한 크기(다양한 변수형태를 가진 또 다른 class)를 지정할 때,
	// 필드값(class가 가지고있는 변수)도 같이 지정할 수 있는 메소드
	// 특징 : 반환값(return) 자체가 없음
	// 		 메소드 이름이 클래스 이름과 같다!
	//		 this가 선언되면 PhoneMain에서 입력된 값이 입력
	public Phone(int displaySize, String pnumber) {
		this.displaySize = displaySize;
		this.pnumber = pnumber;
	}

	// 문자 전송
	public void msgSend() {
		System.out.println("문자를 전송하다");
	}

	// 통화
	public void Call() {
		System.out.println("전화를 걸다");
	}

	// 인터넷 연결
	public void Wifi() {
		System.out.println("인터넷 연결");
	}

	// 카메라
	public void Camera() {
		System.out.println("사진을 찍다");
	}
}
