import java.util.Scanner;

public class AnswerRunner implements Runnable {
	Scanner scan = new Scanner(System.in);
	String answer="";
	@Override
	public void run() {
		
		System.out.println("-------------------------------");
		System.out.println("   환영합니다.청기백기 게임을 시작합니다!");
		System.out.println("-------------------------------");
		System.out.println("조작키 설명");
		System.out.println("1.질의에 맞는 숫자를 입력해주세요");
		System.out.println("2. 0번 둘다올려, 1번 청기올려, 2번 백기올려 3번 백기내려 4번 청기내려");
		
		while(true) {
			answer = scan.next();
			if("q".equals(answer)) System.exit(0);
			if(Flag.answer[Flag.value].equals(answer)) {
				System.out.println("딩동댕.. 정답!!");
			}else {
				System.out.println("땡.. 틀렸습니다!");
			}
			synchronized (this) {
				if(Flag.isWait) {
					notify();
				}	
			}

		}
	}
}
