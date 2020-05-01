package javaUtil.exam;

public class ThreadExam2 {

	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2("*");
		MyThread2 t2 = new MyThread2("-");
		
		//런에이블을 상속 받았긴 때문에 이것은 쓰레드 객체를 만들어서 사용 해야 됨. 
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);

		thread1.start();
		thread2.start();
		
		
		System.out.println("main end !!!");
	}

}
