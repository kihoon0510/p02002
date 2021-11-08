package thread;

import javax.swing.JOptionPane;

public class ThreadEx implements Runnable {
	static boolean autoSave = false;
	public static void main(String[] args) throws Exception {
		
		Thread t = new Thread(new ThreadEx());
		t.setDaemon(true);
		t.start();
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5) {
				autoSave = true;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);
			}catch(InterruptedException e) {
				
			}
			if(autoSave) {
				autoSave();
			}
		}
		
	}
	private void autoSave() {
		System.out.println("자동 저장.");
		
	}

}

class ThreadEx1 extends Thread{
	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}

class ThreadEx2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class ThreadEx3 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
			
		}
	}
}

class ThreadEx4 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
	}
}


















