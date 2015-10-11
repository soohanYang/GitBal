import java.util.Random;

public class FlagRunner implements Runnable {

	Random rand = new Random();

	@Override
	public void run() {
		while(true) {
			Flag.value = rand.nextInt(7);
			System.out.println(Flag.question[Flag.value]);

			try {
				synchronized (this) {
					if(!Flag.isWait) {
						wait(7000);
					}	
				}			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
