import java.util.Scanner;

public class PiggyMenu {

	int menu;
	Scanner sc = new Scanner(System.in);
	PiggyBank bank = new PiggyBank(0);

	public void menu(int menu) {
		if (menu == 1) {
			System.out.print("�Աݾ� : ");
			int inputMoney = sc.nextInt();
			bank.deposit(inputMoney);
			System.out.println("���� �ݾ� : " + bank.money);
		} else if (menu == 2) {
			System.out.print("��ݾ� : ");
			int inputMoney = sc.nextInt();
			bank.withdraw(inputMoney);
			System.out.println("���� �ݾ� : " + bank.money);
		} else if (menu == 3) {
			System.out.println("���� �ݾ� : " + bank.money);
		} else if (menu == 4) {
			System.out.println("���α׷� ����");
		} else {
			System.out.println("�ٽ� �Է����ּ���.");
		}
		System.out.println();
	}
}
