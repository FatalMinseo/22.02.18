import java.util.Scanner;

public class PiggyBank {

	int menu;
	int money;
	Scanner sc = new Scanner(System.in);

	// �ܾ�
	public PiggyBank(int money) {
		this.money = money;
	}
	// �Ա�
	public void deposit(int inputMoney) {
		money += inputMoney;
	}

	// ���
	public void withdraw(int inputMoney) {
		money -= inputMoney;
	}
	public void showMoney(int money) {
		this.money=money ;
	}

}
