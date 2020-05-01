package javaUtil.exam;

public class DeamonThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("데몬쓰레드가 출력 중입니다.<<"+ Math.random()*100);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new DeamonThread());
		
		thread.setDaemon(true); //데몬쓰레드로 설정이 됨.
		thread.start();
		
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread End Stop ");
		
	}

}
