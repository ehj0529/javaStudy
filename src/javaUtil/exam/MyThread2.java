package javaUtil.exam;

//�ٸ� �������̽��� ��ӹ޴� ��� �����带 ��� ������ ���� ������ 
//Runable�� ��� �޾Ƽ� Thread�� ���� ��.
public class MyThread2 implements Runnable {
	String str;
	
	public MyThread2(String str) {
		this.str = str;
	}
	
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println("<<"+i+">>"+str);
			
			try {
				Thread.sleep((long) (Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
