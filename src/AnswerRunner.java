import java.util.Scanner;

public class AnswerRunner implements Runnable {
	Scanner scan = new Scanner(System.in);
	String answer="";
	@Override
	public void run() {
		
		System.out.println("-------------------------------");
		System.out.println("   ȯ���մϴ�.û���� ������ �����մϴ�!");
		System.out.println("-------------------------------");
		System.out.println("����Ű ����");
		System.out.println("1.���ǿ� �´� ���ڸ� �Է����ּ���");
		System.out.println("2. 0�� �Ѵٿ÷�, 1�� û��÷�, 2�� ���÷� 3�� ��⳻�� 4�� û�⳻��");
		
		while(true) {
			answer = scan.next();
			if("q".equals(answer)) System.exit(0);
			if(Flag.answer[Flag.value].equals(answer)) {
				System.out.println("������.. ����!!");
			}else {
				System.out.println("��.. Ʋ�Ƚ��ϴ�!");
			}
			synchronized (this) {
				if(Flag.isWait) {
					notify();
				}	
			}

		}
	}
}
