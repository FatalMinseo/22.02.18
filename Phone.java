
public class Phone {

	// ��ư����
	int btnNum = 12;
	// ȭ��ũ��
	int displaySize;
	// ��ȣ
	String pnumber;
	
	// ������(�޼ҵ� ����)
	// class�� ���� ũ��(�پ��� �������¸� ���� �� �ٸ� class)�� ������ ��,
	// �ʵ尪(class�� �������ִ� ����)�� ���� ������ �� �ִ� �޼ҵ�
	// Ư¡ : ��ȯ��(return) ��ü�� ����
	// 		 �޼ҵ� �̸��� Ŭ���� �̸��� ����!
	//		 this�� ����Ǹ� PhoneMain���� �Էµ� ���� �Է�
	public Phone(int displaySize, String pnumber) {
		this.displaySize = displaySize;
		this.pnumber = pnumber;
	}

	// ���� ����
	public void msgSend() {
		System.out.println("���ڸ� �����ϴ�");
	}

	// ��ȭ
	public void Call() {
		System.out.println("��ȭ�� �ɴ�");
	}

	// ���ͳ� ����
	public void Wifi() {
		System.out.println("���ͳ� ����");
	}

	// ī�޶�
	public void Camera() {
		System.out.println("������ ���");
	}
}
