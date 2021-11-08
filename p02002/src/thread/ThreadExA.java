package thread;

public class ThreadExA {
	public static void main(String[] args) {
		ThreadExB gc = new ThreadExB();
		gc.setDaemon(true);
		gc.start();
		
		int requireMemory = 0;
		
		for(int i=0; i<20; i++) {
			requireMemory = (int) ((Math.random() *10)*20);
			
			if(gc.freeMemory() < requireMemory || gc.freeMemory() < gc.totalMemory() *0.4) {
				gc.interrupt();
				try {
					gc.join(100);
				} catch (InterruptedException e) { }
			}
			
			gc.usedMemory += requireMemory;
			System.out.println("usedMemory: "+ gc.usedMemory);
		}
	}
}

class ThreadExB extends Thread{
	final static int MAX_MEMORY = 1000;
	int usedMemory = 0;
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(10*1000);
			}catch(InterruptedException e) {
				System.out.println("Awaken by interrupt.");
			}
			
			gc();
			System.out.println("Garbage Collected. Free Memory: "+freeMemory());
		}
	}
	int freeMemory() {
		return MAX_MEMORY - usedMemory;
	}
	int totalMemory() {
		return MAX_MEMORY;
	}
	private void gc() {
		usedMemory -= 300;
		if(usedMemory < 0 ) usedMemory = 0;
	}
}