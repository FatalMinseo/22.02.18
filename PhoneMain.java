
public class PhoneMain {

	public static void main(String[] args) {
		// static Ŭ������ ���ôٹ������� Ȱ��ȭ

		// Phone Ŭ���� ���
		// Ŭ������ ��ü��(������) = new Phone();
		// ������ ������ ������ �ִ� ����/Ÿ��
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
