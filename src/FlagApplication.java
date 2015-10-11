
public class FlagApplication {
	
	public static void main(String[] args) {
		Thread flagThread = new Thread(new FlagRunner());
		Thread ansThread = new Thread(new AnswerRunner());
		flagThread.start();
		ansThread.start();
				
	}
}
