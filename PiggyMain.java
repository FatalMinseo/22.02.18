import java.util.Scanner;

public class PiggyMain {

	public static void main(String[] args) {

		PiggyBank bank = new PiggyBank(0);
		PiggyMenu menu = new PiggyMenu();
		// 0�� �ٸ� �ݾ����� �ٲٸ� ����ϱ� �� �ݾ�
		System.out.println("���� �ݾ� : " + bank.money);
		Scanner sc = new Scanner(System.in);

		int num = 0;
		while (num != 4) {
			System.out.println("[1] �Ա� [2] ��� [3] �ܾ���ȸ [4] ����");
			System.out.print("�޴� ���� : ");
			num = sc.nextInt();
			menu.menu(num);
		}
		sc.close();
	}
}
