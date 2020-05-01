package javaUtil.exam;

//다른 인터페이스를 상속받는 경우 쓰레드를 상속 받을수 없기 때문에 
//Runable을 상속 받아서 Thread를 구현 함.
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
