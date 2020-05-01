package javaUtil.exam;

public class DeamonThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("���󾲷��尡 ��� ���Դϴ�.<<"+ Math.random()*100);
			
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
		
		thread.setDaemon(true); //���󾲷���� ������ ��.
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
