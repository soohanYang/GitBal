import java.util.Scanner;

public class AnswerRunner implements Runnable {
	Scanner scan = new Scanner(System.in);
	String answer="";
	@Override
	public void run() {
		while(true) {
			answer = scan.next();
			if("q".equals(answer)) System.exit(0);
			if(Flag.answer[Flag.value].equals(answer)) {
				System.out.println("������!! ����!!");
			}else {
				System.out.println("��!! Ʋ�Ƚ��ϴ�!");
			}
			synchronized (this) {
				if(Flag.isWait) {
					notify();
				}	
			}

		}
	}
}
